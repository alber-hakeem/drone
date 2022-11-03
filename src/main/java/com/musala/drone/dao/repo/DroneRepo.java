package com.musala.drone.dao.repo;

import com.musala.drone.model.Drone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Alber Rashad
 * @created 03/11/2022
 * @description
 */
@Repository
public interface DroneRepo extends JpaRepository<Drone, Long> {
}
