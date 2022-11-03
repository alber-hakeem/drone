package com.musala.drone.service;

import com.musala.drone.base.service.MessageService;
import com.musala.drone.dao.DroneDao;
import com.musala.drone.dto.DroneBatteryCapacityDto;
import com.musala.drone.dto.DroneDto;
import com.musala.drone.dto.MedicationDto;
import com.musala.drone.transformer.DroneTransformer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Alber Rashad
 * @created 03/11/2022
 * @description
 */
@Service
@AllArgsConstructor
public class DroneServiceImpl implements DroneService {
    private final DroneTransformer droneTransformer;
    private final DroneDao droneDao;
    private final MessageService messageService;
    private final MedicationService medicationService;

    @Override
    public DroneTransformer getTransformer() {
        return droneTransformer;
    }

    @Override
    public DroneDao getDao() {
        return droneDao;
    }

    @Override
    public MessageService getMessageService() {
        return messageService;
    }

    @Override
    public List<DroneDto> findAllAvailableDrone() {
        return getTransformer().transformEntityToDTO(getDao().findAllAvailableDrone());
    }
    @Override
    public DroneBatteryCapacityDto findBatteryCapacity(Long droneId) {
        return getDao().findBatteryCapacity(droneId);
    }

    @Override
    public DroneDto loadMedicationItems(long droneId, List<MedicationDto> medicationDtos) {
        DroneDto droneDto=findById(droneId);
        List<MedicationDto> addedMeditations=medicationService.loadMedicationItems(droneDto,medicationDtos);
        droneDto.setMedicationDtoList(addedMeditations);
        return droneDto;
    }
}
