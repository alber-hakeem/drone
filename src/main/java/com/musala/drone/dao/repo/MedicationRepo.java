package com.musala.drone.dao.repo;

import com.musala.drone.model.Medication;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Alber Rashad
 * @created 04/11/2022
 * @description
 */
public interface MedicationRepo extends JpaRepository<Medication,Long> {
}
