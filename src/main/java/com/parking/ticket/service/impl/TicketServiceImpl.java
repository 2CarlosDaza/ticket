package com.parking.ticket.service.impl;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parking.ticket.model.entity.TicketEntity;
import com.parking.ticket.repository.TicketRepository;
import com.parking.ticket.service.TicketService;

@Service
public class TicketServiceImpl implements TicketService{
	@Autowired
	TicketRepository repository;
	
	@Override
	public ArrayList<TicketEntity> getAllTickets() {
		return (ArrayList<TicketEntity>)repository.findAll();
	}

	@Override
	public Optional<TicketEntity> getTicketById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public TicketEntity saveTicket(TicketEntity u) {
		return repository.save(u);
	}

	@Override
	public boolean deleteTicketById(Integer id) {
		try {
			Optional<TicketEntity> u=getTicketById(id);
			if(u.isPresent()) {
				repository.delete(u.get());
				return true;
			}
			return false;
			
		}catch(Exception e) {
			return false;
		}
	}

}
