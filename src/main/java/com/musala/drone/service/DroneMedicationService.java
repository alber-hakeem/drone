package com.musala.drone.service;

import com.musala.drone.base.service.BaseService;
import com.musala.drone.dao.DroneMedicationDao;
import com.musala.drone.dto.DroneMedicationDto;
import com.musala.drone.model.DroneMedication;
import com.musala.drone.transformer.DroneMedicationTransformer;

/**
 * @author Alber Rashad
 * @created 05/11/2022
 * @description
 */
public interface DroneMedicationService extends BaseService<DroneMedication, DroneMedicationDto, DroneMedicationTransformer, DroneMedicationDao> {
}
