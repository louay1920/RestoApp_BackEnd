package com.example.demo.endpoints;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dto.TableReponse;
import com.example.demo.Dto.TableRequest;
import com.example.demo.Dto.TicketReponse;
import com.example.demo.Dto.TicketRequest;
import com.example.demo.modeles.ClientEntity;
import com.example.demo.modeles.TableEntity;
import com.example.demo.services.TableService;
import com.example.demo.services.TicketService;
@RestController
@RequestMapping(("/api/tables"))
public class TableRest {
	
	private TableService service;
	
	
    public TableRest(TableService service) {
		// TODO Auto-generated constructor stub
    	
    	super();
		this.service=service;
	}
    
    @PostMapping
	public TableReponse createTable(@RequestBody TableRequest table) {
	return service.createTableEntity(table);
    }
    
    
    @GetMapping
	public List<TableEntity> getAll() {
		return service.getAllTableEntities();
	}
    
    
    @GetMapping("/{id}")
	public TableReponse getTableById(@PathVariable("id") int id) {
    	return service.getById(id);
		
	}
    
    
    @PutMapping("/{numero}")
    public TableReponse modifyTable(@PathVariable("numero")int numero,@RequestBody TableRequest newTable)
    {
    	return service.modifyTableEntity(numero, newTable);
    }
    
    
    @DeleteMapping("/{id}")
    public TableReponse deleteTableById(@PathVariable("id")int id)
    {
    	return service.deleteTableEntityById(id);
    }
    	
		


}
