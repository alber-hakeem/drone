package com.musala.drone.dao.repo;

import com.musala.drone.model.DroneMedication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Alber Rashad
 * @created 05/11/2022
 * @description
 */
@Repository
public interface DroneMedicationRepo extends JpaRepository<DroneMedication,Long> {
}
