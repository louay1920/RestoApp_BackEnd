package com.example.demo.Dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientReponse {
	private String nom;
	private String prenom;
	private LocalDate dateDeNaissance;
	private String courriel;
	private String telephone;
	private int age;

}
