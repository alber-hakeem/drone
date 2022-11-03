package com.musala.drone.dao;

import com.musala.drone.base.dao.BaseDao;
import com.musala.drone.dao.repo.DroneRepo;
import com.musala.drone.dto.DroneDto;
import com.musala.drone.model.Drone;

/**
 * @author Alber Rashad
 * @created 03/11/2022
 * @description
 */

public interface DroneDao extends BaseDao<Drone, DroneRepo> {
}

