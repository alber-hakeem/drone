package com.musala.drone.service;

import com.musala.drone.base.service.BaseService;
import com.musala.drone.dao.DroneDao;
import com.musala.drone.dto.DroneDto;
import com.musala.drone.model.Drone;
import com.musala.drone.transformer.DroneTransformer;

/**
 * @author Alber Rashad
 * @created 03/11/2022
 * @description
 */
public interface DroneService extends BaseService<Drone, DroneDto, DroneTransformer, DroneDao> {
}
