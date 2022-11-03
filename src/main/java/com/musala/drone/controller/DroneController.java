package com.musala.drone.controller;

import com.musala.drone.base.api.response.ApiResponse;
import com.musala.drone.base.api.response.ApiResponseBuilder;
import com.musala.drone.base.controller.BaseController;
import com.musala.drone.dto.DroneDto;
import com.musala.drone.service.DroneService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Alber Rashad
 * @created 03/11/2022
 * @description
 */
@RequestMapping("api/drone")
@RestController
@AllArgsConstructor
public class DroneController implements BaseController<DroneService, DroneDto> {
    private final DroneService droneService;
    private final ApiResponseBuilder apiResponseBuilder;


    @PostMapping
    public ApiResponse<DroneDto> create(@RequestBody DroneDto droneDto) {
        return getApiResponseBuilder().buildApiSuccessResponse(getService().create(droneDto));
    }

    @GetMapping("/available-drones")
    public ApiResponse<List<DroneDto>> findAvailableDrones(){
        return getApiResponseBuilder().buildApiSuccessResponse(getService().findAllAvailableDrone());
    }
    @GetMapping("/battery-capacity/{droneId}")
    public ApiResponse<List<DroneDto>> findDroneBatteryCapacity(@PathVariable Long droneId){
        return getApiResponseBuilder().buildApiSuccessResponse(getService().findBatteryCapacity(droneId));
    }

    @Override
    public DroneService getService() {
        return droneService;
    }

    @Override
    public ApiResponseBuilder getApiResponseBuilder() {
        return apiResponseBuilder;
    }
}