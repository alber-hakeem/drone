package com.musala.drone.service;

import com.musala.drone.base.service.BaseService;
import com.musala.drone.dao.DroneDao;
import com.musala.drone.dto.DroneBatteryCapacityDto;
import com.musala.drone.dto.DroneDto;
import com.musala.drone.model.Drone;
import com.musala.drone.transformer.DroneTransformer;

import java.util.List;

/**
 * @author Alber Rashad
 * @created 03/11/2022
 * @description
 */
public interface DroneService extends BaseService<Drone, DroneDto, DroneTransformer, DroneDao> {
    public List<DroneDto> findAllAvailableDrone();
    public DroneBatteryCapacityDto findBatteryCapacity(Long droneId);
}
