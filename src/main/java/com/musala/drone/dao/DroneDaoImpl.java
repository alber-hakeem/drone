package com.musala.drone.dao;

import com.musala.drone.dao.DroneDao;
import com.musala.drone.dao.repo.DroneRepo;
import org.springframework.stereotype.Component;

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
}
