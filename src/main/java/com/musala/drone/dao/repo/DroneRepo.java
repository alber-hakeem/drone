package com.musala.drone.dao.repo;

import com.musala.drone.dto.DroneBatteryCapacityDto;
import com.musala.drone.enums.DroneState;
import com.musala.drone.model.Drone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Alber Rashad
 * @created 03/11/2022
 * @description
 */
@Repository
public interface DroneRepo extends JpaRepository<Drone, Long> {
    List<Drone> findAllByState(DroneState state);

    @Query("select new com.musala.drone.dto.DroneBatteryCapacityDto(batteryCapacity) from Drone where id=:droneId")
    DroneBatteryCapacityDto findBatteryCapacity(Long droneId);

}
