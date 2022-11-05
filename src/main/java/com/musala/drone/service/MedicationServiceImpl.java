package com.musala.drone.service;

import com.musala.drone.base.service.MessageService;
import com.musala.drone.dao.MedicationDao;
import com.musala.drone.dto.DroneDto;
import com.musala.drone.dto.MedicationDto;
import com.musala.drone.transformer.MedicationTransformer;
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
    private final MedicationTransformer medicationTransformer;
    private final MedicationDao medicationDao;
    private final MessageService messageService;

    @Override
    public MedicationTransformer getTransformer() {
        return medicationTransformer;
    }
    @Override
    public MedicationDao getDao() {
        return medicationDao;
    }
    @Override
    public MessageService getMessageService() {
        return messageService;
    }

}
