package com.musala.drone.service;

import com.musala.drone.base.service.MessageService;
import com.musala.drone.dao.DroneDao;
import com.musala.drone.dto.DroneBatteryCapacityDto;
import com.musala.drone.dto.DroneDto;
import com.musala.drone.dto.DroneMedicationDto;
import com.musala.drone.dto.MedicationDto;
import com.musala.drone.enums.DroneState;
import com.musala.drone.transformer.DroneTransformer;
import com.musala.drone.validation.DroneLoadValidation;
import com.musala.drone.validation.DroneLoadValidationChain;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

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
    private final DroneMedicationService droneMedicationService;

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
    public DroneDto loadMedicationItems(long droneId, Set<Long> medicationIds) {
        DroneDto droneDto=findById(droneId);
        Set<MedicationDto> medicationDtoSet=getMedicationDtosSet(medicationIds);
        validateLoadingProcess(droneDto, medicationDtoSet);

        changeDroneState(droneDto,DroneState.LOADING);

        loadDrone(droneDto, medicationDtoSet);

        changeDroneState(droneDto,DroneState.LOADED);

        droneDto.setMedicationDtoList(medicationDtoSet);

        return droneDto;

    }

    private void validateLoadingProcess(DroneDto droneDto, Set<MedicationDto> medicationDtoSet) {
        DroneLoadValidationChain droneLoadValidationChain = new DroneLoadValidationChain();
        droneLoadValidationChain.droneLoadValidation.validate(droneDto, medicationDtoSet);
    }

    private void loadDrone(DroneDto droneDto, Set<MedicationDto> medicationDtoSet) {
        List<DroneMedicationDto> droneMedicationDtos = getDroneMedicationDtos(droneDto, medicationDtoSet);
        droneMedicationService.create(droneMedicationDtos);
    }

    private List<DroneMedicationDto> getDroneMedicationDtos(DroneDto droneDto, Set<MedicationDto> medicationDtoSet) {
        List<DroneMedicationDto> droneMedicationDtos=new LinkedList<>();
        medicationDtoSet.forEach(medicationDto -> {
            DroneMedicationDto droneMedicationDto=new DroneMedicationDto(null, droneDto,medicationDto,0);
            droneMedicationDtos.add(droneMedicationDto);
        });
        return droneMedicationDtos;
    }

    private Set<MedicationDto> getMedicationDtosSet(Set<Long> medicationIds){
        Set<MedicationDto> medicationDtoSet=new LinkedHashSet<>();
        medicationIds.forEach(medicationId->medicationDtoSet.add(medicationService.findById(medicationId)));
        return medicationDtoSet;
    }

    private void changeDroneState(DroneDto droneDto, DroneState droneState){
        droneDto.setState(droneState);
        update(droneDto,droneDto.getId());
    }
}
