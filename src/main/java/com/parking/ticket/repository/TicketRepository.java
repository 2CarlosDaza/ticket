package com.parking.ticket.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.parking.ticket.model.entity.TicketEntity;

@Repository
public interface TicketRepository extends CrudRepository<TicketEntity,Integer>{

}
