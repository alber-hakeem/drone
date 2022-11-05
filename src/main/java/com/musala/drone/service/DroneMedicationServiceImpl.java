package com.musala.drone.service;

import com.musala.drone.base.service.MessageService;
import com.musala.drone.dao.DroneMedicationDao;
import com.musala.drone.transformer.DroneMedicationTransformer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Alber Rashad
 * @created 05/11/2022
 * @description
 */
@AllArgsConstructor
@Service
public class DroneMedicationServiceImpl implements DroneMedicationService{

    private final DroneMedicationTransformer droneMedicationTransformer;
    private final DroneMedicationDao droneMedicationDao;
    private final MessageService messageService;
    @Override
    public DroneMedicationTransformer getTransformer() {
        return droneMedicationTransformer;
    }

    @Override
    public DroneMedicationDao getDao() {
        return droneMedicationDao;
    }

    @Override
    public MessageService getMessageService() {
        return messageService;
    }
}
