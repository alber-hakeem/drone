package com.musala.drone.audit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * @author Alber Rashad
 * @created 04/11/2022
 * @description
 */
@EnableJpaAuditing(auditorAwareRef = "auditorProvider")
@Configuration
public class PersistenceConfig {
    @Bean
    AuditorAware<String> auditorProvider() {
        return new AuditorAwareImpl();
    }
}