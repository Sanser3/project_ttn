package com.myproject.project_ttn.validation_alt;

import com.myproject.project_ttn.entityTtn_alt.EntityTtnAlt;

import java.util.HashSet;
import java.util.Set;

public class TtnValidationServiceAlt {
    private Set<TtnValidationRuleAlt> ttnValidationRules = new HashSet<>();

    public TtnValidationServiceAlt() {
        ttnValidationRules.add(new TtnNameValidationRuleAlt());
    }

    public void validate(EntityTtnAlt entityTtnAlt){
        ttnValidationRules.forEach(s -> s.validate(entityTtnAlt));
    }
}
