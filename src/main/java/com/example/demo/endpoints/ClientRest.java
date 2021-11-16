package com.example.demo.endpoints;

import java.util.List;
import java.util.Map;

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
import com.example.demo.Dto.TicketReponse;
import com.example.demo.modeles.ClientEntity;
import com.example.demo.services.ClientService;


@RestController
@RequestMapping(("/api/clients"))
public class ClientRest {
	
	private ClientService service;
	
	public ClientRest(ClientService service)
	{
		super();
		this.service=service;
	}
	
	@GetMapping
	public List<ClientReponse> getAll() {
		return service.getAllClientEntities();
	}
	
	@GetMapping("/{id}")
	public ClientReponse getClientById(@PathVariable("id")int id)
	{
		return service.getById(id);
	}
	
	@PostMapping
	public ClientReponse createClient(@RequestBody ClientRequest client) {
	return service.createClientEntity(client);
    }
	
	@PutMapping("/{id}")
	public ClientReponse modifyClient(@PathVariable("id") int id, @RequestBody ClientRequest newClient)
	{
		return service.modifyClientEntity(id, newClient);
	}
	
	@DeleteMapping("/{id}")
	public ClientReponse deleteClientById(@PathVariable("id")int id)
	{
		return service.deleteClientEntityById(id);
	}
	
	
	@GetMapping(path = "/plusfidele")
	public Map<String, Long> getClientPlusFidele() {
		return service.getClientPlusFidele();
	}
	
	/*@GetMapping(path = "/plusfidele")
	public String getClientPlusFidele() {
		return service.getClientFidele();
	}*/
	
	
	@GetMapping(path = "/pluserserve")
	public Map<Integer, Long> getTablePlusReserve() {
		return service.getTablePlusReserve();
	}
	
	

}
