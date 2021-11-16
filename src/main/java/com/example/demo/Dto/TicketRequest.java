package com.example.demo.Dto;

import java.time.LocalDate;
import java.util.List;

import com.example.demo.modeles.MetEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketRequest {
	
	//private int numero;
	private LocalDate dateTime;
	private int nbCouvert;
	private float addition;
	private ClientRequest client;
	private TableRequest table;
	private List<MetRequest> mets;

}
