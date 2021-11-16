package com.example.demo.Dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketReponse {
	
	private int numero;
	private LocalDate dateTime;
	private int nbCouvert;
	private float addition;
	//private String clientNom;
	
	

}
