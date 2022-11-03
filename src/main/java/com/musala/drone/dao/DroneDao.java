package com.musala.drone.dao;

import com.musala.drone.base.dao.BaseDao;
import com.musala.drone.dao.repo.DroneRepo;
import com.musala.drone.dto.DroneBatteryCapacityDto;
import com.musala.drone.model.Drone;

import java.util.List;

/**
 * @author Alber Rashad
 * @created 03/11/2022
 * @description
 */

public interface DroneDao extends BaseDao<Drone, DroneRepo> {
    List<Drone> findAllAvailableDrone();
    DroneBatteryCapacityDto findBatteryCapacity(Long droneId);

}

