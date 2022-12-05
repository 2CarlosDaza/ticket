package com.parking.ticket.enumeration;

public enum ParkingLotTypeEnum {
	
	BIKE(1,"Moto"),CAR(2,"Carro");
	
	private Integer id;
	private String value;
	
	private ParkingLotTypeEnum(Integer id, String value){
		this.value = value;
		this.id = id;
	}
	
}
