package com.example.demo.Dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TableReponse {
	
	private int nbCouvert;
	private String type;
	private float supplement;

}
