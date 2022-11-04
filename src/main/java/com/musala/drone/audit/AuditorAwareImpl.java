package com.musala.drone.audit;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

/**
 * @author Alber Rashad
 * @created 04/11/2022
 * @description
 */
public class AuditorAwareImpl implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("Admin");
    }
}