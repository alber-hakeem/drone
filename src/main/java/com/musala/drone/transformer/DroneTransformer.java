package com.musala.drone.transformer;

import com.musala.drone.base.transformer.BaseTransformer;
import com.musala.drone.dto.DroneDto;
import com.musala.drone.model.Drone;
import com.musala.drone.transformer.mapper.DroneMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author Alber Rashad
 * @created 03/11/2022
 * @description
 */

@Component
@AllArgsConstructor
public class DroneTransformer implements BaseTransformer<Drone, DroneDto, DroneMapper> {
    private final DroneMapper droneMapper;

    @Override
    public DroneMapper getMapper() {
        return droneMapper;
    }
}