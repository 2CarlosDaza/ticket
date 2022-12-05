package com.parking.ticket.service;

import java.util.ArrayList;
import java.util.Optional;

import com.parking.ticket.model.entity.ParkingLotEntity;

public interface ParkingLotService {
	ArrayList<ParkingLotEntity> getAllParkingLots();
	Optional<ParkingLotEntity> getParkingLotById(Integer id);
	ParkingLotEntity saveParkingLot(ParkingLotEntity u);
	boolean deleteParkingLotById(Integer id);
}
