package com.musala.drone.dao;

import com.musala.drone.dao.repo.DroneMedicationRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author Alber Rashad
 * @created 05/11/2022
 * @description
 */
@Component
@AllArgsConstructor
public class DroneMedicationDaoImpl implements DroneMedicationDao{
    private final DroneMedicationRepo droneMedicationRepo;
    @Override
    public DroneMedicationRepo getRepository() {
        return droneMedicationRepo;
    }
}
