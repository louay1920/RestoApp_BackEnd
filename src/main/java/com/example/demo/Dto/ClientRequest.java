package com.example.demo.Dto;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.OneToMany;

import org.hibernate.annotations.BatchSize;

import com.example.demo.modeles.TicketEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientRequest {
	
	private int id;
	private String nom;
	private String prenom;
	private LocalDate dateDeNaissance;
	private String courriel;
	private String telephone;

}
