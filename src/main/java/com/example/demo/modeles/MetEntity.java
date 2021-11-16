package com.example.demo.modeles;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="Met")
@AllArgsConstructor
@NoArgsConstructor
public class MetEntity {
	
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	//private int id;
	@Id
	private String nom;
	private float prix;
	@Enumerated(EnumType.STRING)
	private TypeMet type;
	
	@ManyToMany
	@JoinTable(name="compose")
	private List<TicketEntity> tickets;

}
