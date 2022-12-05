package com.parking.ticket.enumeration;

import lombok.Data;

public enum TicketStateEnum {

	PENDING(1,"Disponible"),PAYED(2,"Ocupado"),DELETED(3,"Borrada");
	
	private Integer id;
	private String value;

	private TicketStateEnum(Integer id, String value){
		this.setValue(value);
		this.setId(id);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}
