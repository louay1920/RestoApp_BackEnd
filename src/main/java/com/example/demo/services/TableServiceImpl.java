package com.example.demo.services;

import java.util.List;
import java.util.NoSuchElementException;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dto.TableReponse;
import com.example.demo.Dto.TableRequest;
import com.example.demo.Dto.TicketReponse;
import com.example.demo.modeles.TableEntity;
import com.example.demo.modeles.TicketEntity;
import com.example.demo.repositories.ClientRepository;
import com.example.demo.repositories.TableRepository;
import com.example.demo.repositories.TicketRepository;
import java.util.Optional;

@Service
public class TableServiceImpl implements TableService {
	
	private ClientRepository reposClient;
	private TicketRepository reposTicket;
	private TableRepository reposTable;
	private ModelMapper mapper;
	
	@Autowired
	public TableServiceImpl(TicketRepository reposTicket, ClientRepository repos, TableRepository reposTable, ModelMapper mapper) {
		// TODO Auto-generated constructor stub
		super();
		this.reposTicket=reposTicket;
		this.reposClient=repos;
		this.reposTable=reposTable;
		this.mapper=mapper;
	}

	@Override
	public TableReponse createTableEntity(TableRequest request) {
		// TODO Auto-generated method stub
		// Mappage entre TicketRequest -> TicketEntity
				TableEntity entity = mapper.map(request, TableEntity.class);
				
				
						
				//saving Table
				TableEntity newEntity = reposTable.save(entity);
				return mapper.map(newEntity, TableReponse.class);
				
				
				
	}

	@Override
	public List<TableEntity> getAllTableEntities() {
		// TODO Auto-generated method stub
		return reposTable.findAll();
	}

	@Override
	public TableReponse getById(int id) {
		// TODO Auto-generated method stub

TableEntity entity;
		Optional<TableEntity> opt = reposTable.findById(id);
		if(opt.isPresent())
			entity = opt.get();
		else
			throw new NoSuchElementException("Table with this id is not found");
		
		
		TableReponse table = new TableReponse(entity.getNbCouvert(), entity.getType(), entity.getSupplement());
		return table;
	}

	@Override
	public TableReponse modifyTableEntity(int id, TableRequest newTable) {
		// TODO Auto-generated method stub
		TableEntity entity = mapper.map(newTable, TableEntity.class);
        TableEntity oldEntity = reposTable.findById(id).get();
        if(newTable.getNbCouvert()!=0)
            oldEntity.setNbCouvert(newTable.getNbCouvert());
        if(newTable.getType()!=null)
            oldEntity.setType(newTable.getType());
        if(newTable.getSupplement()!=0)
            oldEntity.setSupplement(newTable.getSupplement());
        
        return mapper.map(reposTable.save(oldEntity), TableReponse.class);
	}

	@Override
	public TableReponse deleteTableEntityById(int id) {
		// TODO Auto-generated method stub
		TableReponse entity = this.getById(id);
		reposTable.deleteById(id);
		return entity;
	}

}
