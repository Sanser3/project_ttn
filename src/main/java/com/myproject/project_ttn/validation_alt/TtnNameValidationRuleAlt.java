package com.myproject.project_ttn.validation_alt;

import com.myproject.project_ttn.entityTtn_alt.EntityTtnAlt;

public class TtnNameValidationRuleAlt implements TtnValidationRuleAlt {
    @Override
    public void validate(EntityTtnAlt entityTtnAlt) {
        if (entityTtnAlt.getName() == null) {
            throw new TtnValidationExceptionAlt("Name must be not null");
        }
    }
}

