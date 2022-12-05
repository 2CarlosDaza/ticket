package com.parking.ticket.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parking.ticket.service.TicketService;
import com.parking.ticket.model.entity.TicketEntity;

@RestController
@RequestMapping("api/ticket")
public class TicketController {
	@Autowired
	TicketService service;
	@GetMapping("/hi")
	public String Saludar() {	return "Hola mundo";}
	
	@GetMapping("/all")
	public ArrayList<TicketEntity> getAll() {	
		return service.getAllTickets();
	}
	@PostMapping("/save")
	public TicketEntity saveTicket(
			@RequestBody TicketEntity ticket) {	
		return service.saveTicket(ticket);
	}
	@PostMapping("/liquidate/{id}")
	public TicketEntity liquidate(
			@PathVariable("id") Integer id) {	
		return null;//service.saveTicket(ticket);
	}
	@PostMapping("/pay/{id}")
	public TicketEntity pay(
			@PathVariable("id") Integer id) {	
		return null;// service.saveTicket(ticket);
	}
	@GetMapping("/find/{id}")
	public Optional<TicketEntity> getTicketById(
			@PathVariable("id") Integer id) {	
		return service.getTicketById(id);
	}
	
}
