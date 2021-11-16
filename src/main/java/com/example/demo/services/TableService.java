package com.example.demo.services;

import java.util.List;

import com.example.demo.Dto.TableReponse;
import com.example.demo.Dto.TableRequest;
import com.example.demo.modeles.TableEntity;


public interface TableService {
	
	TableReponse createTableEntity(TableRequest request);
    List<TableEntity> getAllTableEntities();
    TableReponse getById(int id);
    TableReponse modifyTableEntity(int id, TableRequest newTable);
    TableReponse deleteTableEntityById(int id);

}
