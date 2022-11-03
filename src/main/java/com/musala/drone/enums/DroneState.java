package com.musala.drone.enums;

/**
 * @author Alber Rashad
 * @created 03/11/2022
 * @description
 */
public enum DroneState {
    IDLE("IDLE"),
    LOADING("LOADING"),
    LOADED("LOADED"),
    DELIVERING("DELIVERING"),
    DELIVERED("DELIVERED"),
    RETURNING("RETURNING");

    private final String state;

    DroneState(String model) {
        this.state = model;
    }

    public String getState() {
        return state;
    }

}
