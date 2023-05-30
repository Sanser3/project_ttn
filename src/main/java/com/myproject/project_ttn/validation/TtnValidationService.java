package com.myproject.project_ttn.validation;

import com.myproject.project_ttn.entityTtn.EntityTtn;

import java.util.HashSet;
import java.util.Set;

public class TtnValidationService {
    private Set<TtnValidationRule> ttnValidationRules = new HashSet<>();

    public TtnValidationService() {
        ttnValidationRules.add(new TtnNameValidationRule());
    }

    public void validate(EntityTtn entityTtn){
        ttnValidationRules.forEach(s -> s.validate(entityTtn));
    }
}
