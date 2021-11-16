package com.example.demo.services;

import java.util.List;
import java.util.Map;

import com.example.demo.Dto.ClientReponse;
import com.example.demo.Dto.ClientRequest;
import com.example.demo.modeles.ClientEntity;



public interface ClientService {
	
	
	public String getClientFidele();
	ClientReponse createClientEntity(ClientRequest request);
	List<ClientReponse> getAllClientEntities();
	public ClientReponse getById(int id);
	public ClientReponse modifyClientEntity(int id, ClientRequest newClient);
	public ClientReponse deleteClientEntityById(int id);
	
	public Map<String, Long> getClientPlusFidele();
	public Map<Integer, Long> getTablePlusReserve();

}
