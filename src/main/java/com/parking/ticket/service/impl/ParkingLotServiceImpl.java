package com.parking.ticket.service.impl;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parking.ticket.model.entity.ParkingLotEntity;
import com.parking.ticket.repository.ParkingLotRepository;
import com.parking.ticket.service.ParkingLotService;

@Service
public class ParkingLotServiceImpl implements ParkingLotService{

	@Autowired
	ParkingLotRepository repository;
	@Override
	public ArrayList<ParkingLotEntity> getAllParkingLots() {
		return (ArrayList<ParkingLotEntity>)repository.findAll();
	}

	@Override
	public Optional<ParkingLotEntity> getParkingLotById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public ParkingLotEntity saveParkingLot(ParkingLotEntity u) {
		return repository.save(u);
	}

	@Override
	public boolean deleteParkingLotById(Integer id) {
		try {
			Optional<ParkingLotEntity> u=getParkingLotById(id);
			if(u.isPresent()) {
				repository.delete(u.get());
				return true;
			}
			return false;
			
		}catch(Exception e) {
			return false;
		}
	}

}
