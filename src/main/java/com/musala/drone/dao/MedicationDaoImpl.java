package com.musala.drone.dao;

import com.musala.drone.dao.repo.MedicationRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author Alber Rashad
 * @created 04/11/2022
 * @description
 */
@Component
@AllArgsConstructor
public class MedicationDaoImpl implements MedicationDao{
    final private MedicationRepo medicationRepo;
    @Override
    public MedicationRepo getRepository() {
        return medicationRepo;
    }
}
