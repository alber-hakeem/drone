package com.musala.drone.base.api.request;

/**
 * @author Alber Rashad
 * @created 29/10/2022
 * @description
 */
public enum SortingDirection {
    ASC("ASC"),
    DESC("DESC");
    private String value;
    public String getValue() { return value; }
    SortingDirection(String value){
        this.value = value;
    }
}
