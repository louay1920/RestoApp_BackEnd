package com.example.demo.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dto.ClientReponse;
import com.example.demo.Dto.TicketReponse;
import com.example.demo.Dto.TicketRequest;
import com.example.demo.modeles.ClientEntity;
import com.example.demo.modeles.MetEntity;
import com.example.demo.modeles.TicketEntity;
import com.example.demo.repositories.ClientRepository;
import com.example.demo.repositories.MetRepository;
import com.example.demo.repositories.TableRepository;
import com.example.demo.repositories.TicketRepository;

@Service
public class TicketServiceImpl implements TicketService {
	
	private ClientRepository reposClient;
	private TicketRepository reposTicket;
	private TableRepository reposTable;
	private MetRepository reposMet;
	private ModelMapper mapper;
	
	@Autowired
	public TicketServiceImpl(TicketRepository reposTicket, ClientRepository repos, TableRepository reposTable, MetRepository reposMet , ModelMapper mapper) {
		
		super();
		this.reposTicket=reposTicket;
		this.reposClient=repos;
		this.reposTable=reposTable;
		this.reposMet= reposMet;
		this.mapper=mapper;
	}

	@Override
	public TicketReponse createTicketEntity(TicketRequest request) {
		// Mappage entre TicketRequest -> TicketEntity
		TicketEntity entity = mapper.map(request, TicketEntity.class);
		
		
				
		//saving Ticket
		TicketEntity newEntity = reposTicket.save(entity);
		
		
		//saving mets
		/*if(entity.getMets()!=null) {
		for (MetEntity met : entity.getMets()) {
			met.setTickets(newEntity);
			reposMet.save(met);
		}}*/
		
		
		
		//saving mets
				List<TicketEntity> tickets;
				if(entity.getMets()!=null) {
				for (MetEntity met : entity.getMets()) {
					if (met.getTickets() != null) {
						tickets = met.getTickets();
					}else {
						tickets = new ArrayList<>();
					}
					tickets.add(newEntity);
					met.setTickets(tickets);
					reposMet.save(met);
					
				}
				}
		
		
		
		return mapper.map(newEntity, TicketReponse.class);

	}

	@Override
	public List<TicketReponse> getAllTicketEntities() {
		List<TicketReponse> listTicketrep = new ArrayList<>();
        List<TicketEntity> listEntity=reposTicket.findAll();
        for (TicketEntity ticketEntiy : listEntity) {
            listTicketrep.add(mapper.map(ticketEntiy, TicketReponse.class));
         
      }
         
       return listTicketrep;
	}
	
	@Override
	public float getRevenuParPeriode(LocalDate dateBegin, LocalDate dateEnd) {
        List<TicketEntity>tickets=reposTicket.findAll();
        float revenu=0;
        for (TicketEntity ticketEntity : tickets) {
            if(ticketEntity.getDateTime().isAfter(dateBegin) && ticketEntity.getDateTime().isBefore(dateEnd)) {
                revenu=revenu+ticketEntity.getAddition();
            }
        }
       
        return revenu;
    }

	@Override
	public TicketReponse getTicketEntityById(int numero) {
		TicketEntity entity = mapper.map(TicketRequest.class, TicketEntity.class);
        Optional<TicketEntity> newEntity = reposTicket.findById(numero);
        if(newEntity.isPresent())
            entity = newEntity.get();
        else
            throw new NoSuchElementException("Ticket with this id is not found");
        
        
        TicketReponse ticket = new TicketReponse(entity.getNumero(),entity.getDateTime(),entity.getNbCouvert(),
                entity.getAddition());
        return mapper.map(ticket, TicketReponse.class);
	}

	@Override
	public TicketReponse modifyTicketEntity(int numero, TicketRequest newTicket) {


		TicketEntity entity = mapper.map(newTicket, TicketEntity.class);
        TicketEntity oldEntity = reposTicket.findById(numero).get();
        if(newTicket.getDateTime()!=null)
            oldEntity.setDateTime(newTicket.getDateTime());
        if(newTicket.getNbCouvert()!=0)
            oldEntity.setNbCouvert(newTicket.getNbCouvert());
        if(newTicket.getAddition()!=0)
            oldEntity.setAddition(newTicket.getAddition());
        
        return mapper.map(reposTicket.save(oldEntity), TicketReponse.class);
		
	}

	@Override
	public TicketReponse deleteTicketEntityById(int id) {
		TicketReponse entity = this.getTicketEntityById(id);
		reposTicket.deleteById(id);
		return entity;
	}

	@Override
	public float revenuParMois(String mois) {
		// TODO Auto-generated method stub
		List<TicketEntity> tickets =  reposTicket.findAll();
		float revenu = 0;
		for (TicketEntity ticketEntity : tickets) {
		if (ticketEntity.getDateTime().toString().substring(5, 7).equals(mois)) {
		//ticketEntity.getDateTime();
			revenu=revenu+ticketEntity.getAddition();
		}
		}
		return  revenu ;
	}

	//@Override
	/*public float getRevenueparJour(String jour) {
		// TODO Auto-generated method stub
		List<TicketEntity> tickets = reposTicket.findAll();
	       
        float revenu=0;
        for (TicketEntity ticketEntity : tickets) {
            //if (ticketEntity.getDateTime().getDayOfMonth() == date.getDayOfMonth())
        	if (ticketEntity.getDateTime().toString().substring(8, 10).equals(jour))
            {
                revenu =revenu + ticketEntity.getAddition();
               
            }       
        }
        return revenu;
	}*/
	
	
	@Override
	public float getRevenueparJour(String date) {
		// TODO Auto-generated method stub
		List<TicketEntity> tickets = reposTicket.findAll();
	       
        float revenu=0;
        for (TicketEntity ticketEntity : tickets) {
            //if (ticketEntity.getDateTime().getDayOfMonth() == date.getDayOfMonth())
        	if (ticketEntity.getDateTime().toString().equals(date))
            {
                revenu =revenu + ticketEntity.getAddition();
               
            }       
        }
        return revenu;
	}

	

}
