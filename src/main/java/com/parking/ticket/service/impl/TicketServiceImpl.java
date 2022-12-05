package com.parking.ticket.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parking.ticket.enumeration.TicketStateEnum;
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

	@Override
	public TicketEntity liquidateTicket(Integer id) {
		TicketEntity ticket=repository.findById(id).orElse(null);
		if(ticket!=null) {
			ticket.setLiquidationDate(Calendar.getInstance().getTime());
			ticket.setTotalLiquidation(calculateLiquidation(ticket));
			repository.save(ticket);
			
			return ticket;
		}else {
			return null;	
		}
		
	}
	private BigDecimal calculateLiquidation(TicketEntity ticket) {
		Calendar startDate=Calendar.getInstance();
		startDate.setTime(ticket.getStartDate());
		Calendar liquidationDate=Calendar.getInstance();
		liquidationDate.setTime(ticket.getLiquidationDate());
		
		Integer hoursLiquidated = liquidationDate.get(Calendar.HOUR_OF_DAY)
								 - startDate.get(Calendar.HOUR_OF_DAY);
		return ticket.getUnitPrice().multiply(BigDecimal.valueOf(hoursLiquidated));
		
	}
	@Override
	public TicketEntity payTicket(Integer id) {
		TicketEntity ticket=repository.findById(id).orElse(null);
		if(ticket!=null) {
			ticket.setStateId(TicketStateEnum.PAYED.getId());
			repository.save(ticket);
			return ticket;
		}else {
			return null;	
		}
		
	}

}
