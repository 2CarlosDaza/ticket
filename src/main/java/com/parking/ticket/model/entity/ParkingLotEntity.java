package com.parking.ticket.model.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = " parking_lot")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParkingLotEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private BigDecimal hourValue;
	private BigDecimal dayValue;
	private BigDecimal weekValue;
	private Integer typeId;
	private Boolean  active;
	private Integer stateId;
	
}
