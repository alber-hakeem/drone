package com.musala.drone.service;

import com.musala.drone.base.service.MessageService;
import com.musala.drone.dao.DroneDao;
import com.musala.drone.dto.DroneBatteryCapacityDto;
import com.musala.drone.dto.DroneDto;
import com.musala.drone.dto.MedicationDto;
import com.musala.drone.transformer.DroneTransformer;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Alber Rashad
 * @created 03/11/2022
 * @description
 */
@Service
public class DroneServiceImpl implements DroneService {
    private final DroneTransformer droneTransformer;
    private final DroneDao droneDao;
    private final MessageService messageService;

    public DroneServiceImpl(DroneTransformer droneTransformer, DroneDao droneDao, MessageService messageService) {
        this.droneTransformer = droneTransformer;
        this.droneDao = droneDao;
        this.messageService = messageService;
    }

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

        return null;
    }


}
