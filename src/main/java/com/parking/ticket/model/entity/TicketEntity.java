package com.parking.ticket.model.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "ticket")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TicketEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer lotId;
	private Date startDate;
	private Date liquidationDate;
	private Integer liquidationType;
	private BigDecimal unitPrice;
	private BigDecimal totalLiquidation;
	private Integer stateId;
}
