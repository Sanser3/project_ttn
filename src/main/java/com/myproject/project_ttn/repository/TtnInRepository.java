package com.myproject.project_ttn.repository;

import com.myproject.project_ttn.entityTtn.EntityTtn;

import java.util.HashMap;
import java.util.Map;

public class TtnInRepository {
    private Integer ttnId = 0;
    private Map<Integer, EntityTtn> entityTtnMap = new HashMap<>();

    public EntityTtn insertEntityTtn (EntityTtn entityTtn){
        entityTtn.setId(ttnId++);
        entityTtnMap.put(entityTtn.getId(), entityTtn);
        return entityTtn;
    }

    public EntityTtn findEntityTtnId (Integer id){
        return entityTtnMap.get(id);
    }
}
