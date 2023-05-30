package com.myproject.project_ttn.validation;

import com.myproject.project_ttn.entityTtn.EntityTtn;

public class TtnNameValidationRule implements TtnValidationRule {
    @Override
    public void validate(EntityTtn entityTtn) {
        if (entityTtn.getName() == null) {
            throw new TtnValidationException("Name must be not null");
        }
    }
}

