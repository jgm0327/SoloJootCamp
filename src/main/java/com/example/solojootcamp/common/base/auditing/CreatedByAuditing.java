package com.example.solojootcamp.common.base.auditing;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CreatedByAuditing implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        String name = "임시";
        return Optional.of(name);
    }
}
