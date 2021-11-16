package com.example.demo.Dto;

import java.util.List;

import com.example.demo.modeles.TypeMet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MetReponse {

	private String nom;
	private float prix;
	private TypeMet type;
}
