package com.example.demo.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dto.ClientReponse;
import com.example.demo.Dto.ClientRequest;
import com.example.demo.modeles.ClientEntity;
import com.example.demo.modeles.TableEntity;
import com.example.demo.modeles.TicketEntity;
import com.example.demo.repositories.ClientRepository;
import com.example.demo.repositories.TableRepository;
import com.example.demo.repositories.TicketRepository;

@Service
public class ClientServiceImpl implements ClientService {
	
	private ClientRepository repos;
	private TicketRepository reposTicket;
	private TableRepository reposTable;
	private ModelMapper mapper;
	
	@Autowired
	public ClientServiceImpl(ClientRepository repos, TicketRepository reposTicket, TableRepository reposTable, ModelMapper mapper)
	{
		super();
		this.repos=repos;
		this.reposTicket=reposTicket;
		this.reposTable=reposTable;
		this.mapper=mapper;
	}
	
	@Override
	public ClientReponse createClientEntity(ClientRequest request)
	{
		// Mappage entre ClientRequest -> ClientEntity
		ClientEntity entity = mapper.map(request, ClientEntity.class);
		
		//saving Client
		ClientEntity newEntity = repos.save(entity);
		
		//saving tickets
				if(entity.getTickets()!=null) {
				for (TicketEntity ticket : entity.getTickets()) {
					ticket.setClient(newEntity);
					reposTicket.save(ticket);
				}}
		return mapper.map(newEntity, ClientReponse.class);
		
	}

	@Override
	public List<ClientReponse> getAllClientEntities() {
		// TODO Auto-generated method stub
		//return repos.findAll();
		List<ClientReponse> listClientrep = new ArrayList<>();
        List<ClientEntity> listEntity=repos.findAll();
        for (ClientEntity clientEntity : listEntity) {
            //listClientrep.add(mapper.map(clientEntity, ClientReponse.class));
        	listClientrep.add(mapper.map(clientEntity, ClientReponse.class));
        }
        return listClientrep;
         
      
	}
	
	
	public ClientReponse getById(int id)
	{
		ClientEntity entity = mapper.map(ClientRequest.class, ClientEntity.class);
        Optional<ClientEntity> newEntity = repos.findById(id);
        if(newEntity.isPresent())
            entity = newEntity.get();
        else
            throw new NoSuchElementException("Client with this id is not found");
        
        
        ClientReponse client = new ClientReponse(entity.getNom(),entity.getPrenom(),
                entity.getDateDeNaissance(),entity.getCourriel(),entity.getTelephone(),entity.getAge());
        return mapper.map(client, ClientReponse.class);
	}
	
	
	
	public ClientReponse modifyClientEntity(int id, ClientRequest newClient)
	{
		ClientEntity entity = mapper.map(newClient, ClientEntity.class);
        ClientEntity oldEntity = repos.findById(id).get();
        if(newClient.getNom()!=null)
            oldEntity.setNom(newClient.getNom());
        if(newClient.getPrenom()!=null)
            oldEntity.setPrenom(newClient.getPrenom());
        if(newClient.getDateDeNaissance()!=null)
            oldEntity.setDateDeNaissance(newClient.getDateDeNaissance());
        if(newClient.getCourriel()!=null)
            oldEntity.setCourriel(newClient.getCourriel());
        if(newClient.getTelephone()!=null)
            oldEntity.setTelephone(newClient.getTelephone());
        
        
            



        return mapper.map(repos.save(oldEntity), ClientReponse.class);
	}
	
	
	public ClientReponse deleteClientEntityById(int id)
	{
		ClientReponse entity = this.getById(id);
		repos.deleteById(id);
		return entity;
	}
	
	 public Map<String, Long> getClientPlusFidele() {
	        List<ClientEntity> clients = repos.findAll();
	        Map<String,Long> clientplusfidele = new HashMap<>();
	        clients.stream().forEach(clt ->{
	            if(clt.getTickets().size()==clients.stream().mapToInt(emp -> emp.getTickets().size()).max().getAsInt()) {
	            	clientplusfidele.put(clt.getNom(), (long) clients.stream().mapToInt(emp -> emp.getTickets().size()).max().getAsInt());
	            }
	        });
	       
	        return clientplusfidele;
	    }
	
	public String getClientFidele() {
        int max=0;
        ClientEntity clientPF = null;
        List<ClientEntity> clients=repos.findAll();
        for (ClientEntity clientEntiy : clients) {
            if(clientEntiy.getTickets().size()>max) {
                max=clientEntiy.getTickets().size();
                clientPF=clientEntiy;
            }
           
        }
       
       
        return clientPF.getNom();}
	 
	 
	 public Map<Integer, Long> getTablePlusReserve() {
	        List<TableEntity> tables = reposTable.findAll();
	        Map<Integer,Long> tablePlusRes = new HashMap<>();
	        tables.stream().forEach(clt ->{
	            if(clt.getTickets().size()==tables.stream().mapToInt(emp -> emp.getTickets().size()).max().getAsInt()) {
	            	tablePlusRes.put(clt.getNumero(), (long) tables.stream().mapToInt(emp -> emp.getTickets().size()).max().getAsInt());
	            }
	        });
	       
	        return tablePlusRes;
	    }

	

}
