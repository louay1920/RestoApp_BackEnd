package com.example.demo.services;

import java.util.List;
import java.util.NoSuchElementException;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dto.MetReponse;
import com.example.demo.Dto.MetRequest;
import com.example.demo.Dto.TicketReponse;
import com.example.demo.modeles.MetEntity;
import com.example.demo.modeles.TicketEntity;
import com.example.demo.repositories.ClientRepository;
import com.example.demo.repositories.MetRepository;
import com.example.demo.repositories.TableRepository;
import com.example.demo.repositories.TicketRepository;
import java.util.Optional;


@Service
public class MetServiceImpl implements MetService {
	
	private ClientRepository reposClient;
	private TicketRepository reposTicket;
	private TableRepository reposTable;
	private MetRepository reposMet;
	private ModelMapper mapper;
	
	@Autowired
	public MetServiceImpl(ClientRepository reposClient, TicketRepository reposTicket, TableRepository reposTable,
			MetRepository reposMet, ModelMapper mapper) {
		super();
		this.reposClient = reposClient;
		this.reposTicket = reposTicket;
		this.reposTable = reposTable;
		this.reposMet = reposMet;
		this.mapper = mapper;
	}

	

	@Override
	public MetReponse createMetEntity(MetRequest request) {
		// Mappage entre MetRequest -> MetEntity
				MetEntity entity = mapper.map(request, MetEntity.class);
				
				
						
				//saving Met
				MetEntity newEntity = reposMet.save(entity);
				return mapper.map(newEntity, MetReponse.class);
			
	}



	@Override
	public List<MetEntity> getAllMetEntities() {
		// TODO Auto-generated method stub
		return reposMet.findAll();
	}



	@Override
	public MetReponse getById(String nom) {
		// TODO Auto-generated method stub
		MetEntity entity;
		Optional<MetEntity> opt = reposMet.findById(nom);
		if(opt.isPresent())
			entity = opt.get();
		else
			throw new NoSuchElementException("Table with this id is not found");
		
		
		MetReponse met = new MetReponse(entity.getNom(), entity.getPrix(), entity.getType());
		return met;
	}



	@Override
	public MetReponse modifyMetEntity(String nom, MetRequest newMet) {
		// TODO Auto-generated method stub
		MetEntity entity = mapper.map(newMet, MetEntity.class);
        MetEntity oldEntity = reposMet.findById(nom).get();
        //if(newMet.getNom()!=null)
           // oldEntity.setNom(newMet.getNom());
        if(newMet.getType()!=null)
            oldEntity.setType(newMet.getType());
        if(newMet.getPrix()!=0)
            oldEntity.setPrix(newMet.getPrix());
        
        return mapper.map(reposMet.save(oldEntity), MetReponse.class);
	}



	@Override
	public MetReponse deleteMetEntityById(String nom) {
		// TODO Auto-generated method stub
		MetReponse entity = this.getById(nom);
		reposMet.deleteById(nom);
		return entity;
	}

}
