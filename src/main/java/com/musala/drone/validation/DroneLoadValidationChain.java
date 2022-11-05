package com.musala.drone.validation;

/**
 * @author Alber Rashad
 * @created 05/11/2022
 * @description
 */
public class DroneLoadValidationChain {
    public DroneLoadValidation droneLoadValidation;

    public DroneLoadValidationChain() {
        this.droneLoadValidation = new DroneStateValidation();
        DroneLoadValidation droneBatteryValidation = new DroneBatteryValidation();
        DroneLoadValidation weightValidation = new WeightValidation();

        droneLoadValidation.setNext(droneBatteryValidation);
        droneBatteryValidation.setNext(weightValidation);
    }
}

