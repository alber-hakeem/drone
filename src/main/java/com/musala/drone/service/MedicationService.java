package com.musala.drone.service;

import com.musala.drone.base.service.BaseService;
import com.musala.drone.dao.MedicationDao;
import com.musala.drone.dto.DroneDto;
import com.musala.drone.dto.MedicationDto;
import com.musala.drone.model.Medication;
import com.musala.drone.transformer.MedicationTransformer;
import java.util.List;

/**
 * @author Alber Rashad
 * @created 03/11/2022
 * @description
 */
public interface MedicationService extends BaseService<Medication, MedicationDto, MedicationTransformer, MedicationDao> {
     List<MedicationDto> loadMedicationItems(DroneDto droneDto, List<MedicationDto> medicationDtos);
}
