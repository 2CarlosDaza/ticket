package com.parking.ticket.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.parking.ticket.model.entity.ParkingLotEntity;

@Repository
public interface ParkingLotRepository extends CrudRepository<ParkingLotEntity,Integer>{

}
