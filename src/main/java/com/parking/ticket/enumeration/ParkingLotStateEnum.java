package com.parking.ticket.enumeration;

public enum ParkingLotStateEnum {
	AVAILABLE(1,"Disponible"),OCCUPIED(2,"Ocupado");
	
	private Integer id;
	private String value;
	
	private ParkingLotStateEnum(Integer id, String value){
		this.value = value;
		this.id = id;
	}
}
