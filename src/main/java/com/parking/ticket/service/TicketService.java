package com.parking.ticket.service;

import java.util.ArrayList;
import java.util.Optional;

import com.parking.ticket.model.entity.TicketEntity;

public interface TicketService {
	ArrayList<TicketEntity> getAllTickets();
	Optional<TicketEntity> getTicketById(Integer id);
	TicketEntity saveTicket(TicketEntity u);
	boolean deleteTicketById(Integer id);
	TicketEntity liquidateTicket(Integer id);
	TicketEntity payTicket(Integer id);
}
