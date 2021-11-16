package com.example.demo.services;

import java.time.LocalDate;
import java.util.List;

import com.example.demo.Dto.TicketReponse;
import com.example.demo.Dto.TicketRequest;
import com.example.demo.modeles.TicketEntity;

public interface TicketService {
	
	TicketReponse createTicketEntity(TicketRequest request);
	List<TicketReponse> getAllTicketEntities();
    TicketReponse getTicketEntityById(int numero);
    TicketReponse modifyTicketEntity(int numero, TicketRequest entity);
    TicketReponse deleteTicketEntityById(int id);
    
    
    public float getRevenuParPeriode(LocalDate dateBegin, LocalDate dateEnd);
    public float revenuParMois(String mois);
    //public float getRevenueparJour(String jour);
    public float getRevenueparJour(String date);

}
