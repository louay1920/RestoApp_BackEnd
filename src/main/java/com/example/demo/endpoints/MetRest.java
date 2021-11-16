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

import com.example.demo.Dto.ClientReponse;
import com.example.demo.Dto.ClientRequest;
import com.example.demo.Dto.MetReponse;
import com.example.demo.Dto.MetRequest;
import com.example.demo.modeles.MetEntity;
import com.example.demo.services.ClientService;
import com.example.demo.services.MetService;

@RestController
@RequestMapping(("/api/mets"))
public class MetRest {
	
	private MetService service;
	
	public MetRest(MetService service)
	{
		super();
		this.service=service;
	}
	
	@PostMapping
	public MetReponse createMet(@RequestBody MetRequest met) {
	return service.createMetEntity(met);
    }
	
	@GetMapping
	public List<MetEntity> getAllMet()
	{
		return service.getAllMetEntities();
	}
	
	@GetMapping("/{nom}")
	public MetReponse getMetById(@PathVariable("nom") String nom)
	{
		return service.getById(nom);
	}
	
	
	@PutMapping("/{nom}")
	public MetReponse ModifyMet(@PathVariable("nom")String nom,@RequestBody MetRequest newMet)
	{
		return service.modifyMetEntity(nom, newMet);
	}
	
	
	@DeleteMapping("/{nom}")
	public MetReponse deleteMetById(@PathVariable("nom") String nom)
	{
		return service.deleteMetEntityById(nom);
	}

}
