package com.parking.ticket.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parking.ticket.model.entity.ParkingLotEntity;
import com.parking.ticket.service.ParkingLotService;


@RestController
@RequestMapping("api/parking")
public class ParkingLotController {
	@Autowired
	ParkingLotService service;
	
	@GetMapping("/hi")
	public String Saludar() {	return "Hola mundo";}
	@GetMapping("/all")
	public ArrayList<ParkingLotEntity> getAll() {	
		return service.getAllParkingLots();
	}
	@PostMapping("/save")
	public ParkingLotEntity saveParkingLot(
			@RequestBody ParkingLotEntity lot) {	
		return service.saveParkingLot(lot);
	}
	
}



