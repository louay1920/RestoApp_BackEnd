package com.example.demo.Dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TableRequest {
	
	
	//private int numero;
	private int nbCouvert;
	private String type;
	private float supplement;

}
