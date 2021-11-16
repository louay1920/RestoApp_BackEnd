package com.example.demo.modeles;

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
@Table(name="Tables")
public class TableEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int numero;
	private int nbCouvert;
	private String type;
	private float supplement;
	
	@OneToMany(mappedBy = "table")
	private List<TicketEntity> tickets;

}
