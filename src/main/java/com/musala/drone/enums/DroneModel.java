package com.musala.drone.enums;

/**
 * @author Alber Rashad
 * @created 03/11/2022
 * @description
 */
public enum DroneModel {
    LIGHTWEIGHT("Lightweight"),
    MIDDLEWEIGHT("Middleweight"),
    CRUISERWEIGHT("Cruiserweight"),
    HEAVYWEIGHT("Heavyweight");


    private final String model;

    DroneModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

}
