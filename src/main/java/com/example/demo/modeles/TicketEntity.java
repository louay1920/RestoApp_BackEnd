package com.example.demo.modeles;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.demo.Dto.ClientRequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Ticket")
public class TicketEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int numero;
	private LocalDate dateTime;
	private int nbCouvert;
	private float addition;
	@ManyToOne
	private ClientEntity client;
	
	@ManyToOne
	private TableEntity table;
	
	@ManyToMany(mappedBy = "tickets")
	private List<MetEntity> mets;
	
	public String getClientNom()
	{
		return client.getNom();
	}

}
