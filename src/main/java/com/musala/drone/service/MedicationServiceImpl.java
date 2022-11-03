package com.musala.drone.service;

import com.musala.drone.base.service.MessageService;
import com.musala.drone.dao.DroneDao;
import com.musala.drone.dto.DroneDto;
import com.musala.drone.dto.MedicationDto;
import com.musala.drone.model.Medication;
import com.musala.drone.transformer.DroneTransformer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Alber Rashad
 * @created 03/11/2022
 * @description
 */
@AllArgsConstructor
@Service
public class MedicationServiceImpl implements MedicationService{
    private final DroneTransformer droneTransformer;
    private final DroneDao droneDao;
    private final MessageService messageService;



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
    public List<MedicationDto> loadMedicationItems(DroneDto droneDto, List<MedicationDto> medicationDtos) {

        medicationDtos.forEach(medicationDto -> {
            medicationDto.setDroneDto(droneDto);
        });
        return create(medicationDtos);
    }
}
