package com.parking.ticket.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "person")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParkingLotEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String hourValue;
	private String dayValue;
	private Integer weekValue;
	private Integer typeId;
	private Boolean  active;
	private Integer stateId;
	
}
