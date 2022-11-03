package com.musala.drone.dao;

import com.musala.drone.dao.repo.DroneRepo;
import com.musala.drone.dto.DroneBatteryCapacityDto;
import com.musala.drone.enums.DroneState;
import com.musala.drone.model.Drone;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Alber Rashad
 * @created 03/11/2022
 * @description
 */
@Component
public class DroneDaoImpl implements DroneDao {
    private final DroneRepo droneRepo;

    public DroneDaoImpl(DroneRepo droneRepo) {
        this.droneRepo = droneRepo;
    }

    @Override
    public DroneRepo getRepository() {
        return droneRepo;
    }

    @Override
    public List<Drone> findAllAvailableDrone() {
        return droneRepo.findAllByState(DroneState.IDLE);
    }

    @Override
    public DroneBatteryCapacityDto findBatteryCapacity(Long droneId) {
        return getRepository().findBatteryCapacity(droneId);
    }
}
