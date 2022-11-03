package com.musala.drone.base.api.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Alber Rashad
 * @created 29/10/2022
 * @description
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserCredentials {
    private String username;
    private String password;
}
