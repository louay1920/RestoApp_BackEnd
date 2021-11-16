package com.example.demo.modeles;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Client")

public class ClientEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	private String prenom;
	private LocalDate dateDeNaissance;
	private String courriel;
	private String telephone;
	
	@OneToMany(mappedBy = "client")
	private List<TicketEntity> tickets;
	
	public int getAge() 
	{
		return LocalDate.now().getYear()-this.getDateDeNaissance().getYear();
	}
	
	

}
