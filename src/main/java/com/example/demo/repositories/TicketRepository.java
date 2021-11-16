package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modeles.TicketEntity;

public interface TicketRepository extends JpaRepository<TicketEntity, Integer> {

}
