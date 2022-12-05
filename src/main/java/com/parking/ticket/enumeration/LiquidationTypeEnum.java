package com.parking.ticket.enumeration;

public enum LiquidationTypeEnum {

	HOUR(1,"Hora"),DAY(2,"Dia"),WEEK(3,"Semana");
	
	private Integer id;
	private String value;

	private LiquidationTypeEnum(Integer id, String value){
		this.value = value;
		this.id = id;
	}
	
}
