package com.example.demo.services;

import java.util.List;

import com.example.demo.Dto.MetReponse;
import com.example.demo.Dto.MetRequest;
import com.example.demo.modeles.MetEntity;

public interface MetService {
	MetReponse createMetEntity(MetRequest request);
	List<MetEntity> getAllMetEntities();
	MetReponse getById(String nom);
	MetReponse modifyMetEntity(String nom, MetRequest newMet);
	MetReponse deleteMetEntityById(String nom);

}
