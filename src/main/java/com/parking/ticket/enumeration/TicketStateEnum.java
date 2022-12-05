package com.parking.ticket.enumeration;

public enum TicketStateEnum {

	PENDING(1,"Disponible"),PAYED(2,"Ocupado"),DELETED(3,"Borrada");
	
	private Integer id;
	private String value;

	private TicketStateEnum(Integer id, String value){
		this.value = value;
		this.id = id;
	}
	
}
