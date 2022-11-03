package com.musala.drone.base.controller;

import com.musala.drone.base.api.response.ApiResponseBuilder;
import com.musala.drone.base.dto.BaseDto;
import com.musala.drone.base.service.BaseService;

/**
 * Base Class for controllers
 * Each controller should be for a dto
 * @author Alber Rashad
 * @created 29/10/2022
 * @description
 */
public interface BaseController<Service extends BaseService,Dto extends BaseDto> {
    /**
     * Service to be used by the controller
     * @return
     */
    Service getService();

    /**
     * Every Controller should use the response API builder to build the response
     * @return
     */
    ApiResponseBuilder getApiResponseBuilder();
}
