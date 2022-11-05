package com.musala.drone.controller;

import com.musala.drone.base.api.response.ApiResponse;
import com.musala.drone.base.api.response.ApiResponseBuilder;
import com.musala.drone.base.controller.BaseController;
import com.musala.drone.dto.DroneDto;
import com.musala.drone.dto.MedicationDto;
import com.musala.drone.service.MedicationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author Alber Rashad
 * @created 04/11/2022
 * @description
 */
@RequestMapping("api/medication")
@RestController
@AllArgsConstructor
public class MedicationController implements BaseController<MedicationService, MedicationDto> {

    private final MedicationService medicationService;
    private final ApiResponseBuilder apiResponseBuilder;


    @PostMapping
    public ApiResponse<MedicationDto> create(@Valid @RequestBody MedicationDto medicationDto) {
        return getApiResponseBuilder().buildApiSuccessResponse(getService().create(medicationDto));
    }

    @Override
    public MedicationService getService() {
        return medicationService;
    }

    @Override
    public ApiResponseBuilder getApiResponseBuilder() {
        return apiResponseBuilder;
    }
}
