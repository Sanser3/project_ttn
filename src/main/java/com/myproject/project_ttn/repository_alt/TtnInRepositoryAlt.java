package com.myproject.project_ttn.repository_alt;

import com.myproject.project_ttn.entityTtn_alt.EntityTtnAlt;

import java.util.HashMap;
import java.util.Map;

public class TtnInRepositoryAlt {
    private Integer ttnId = 0;
    private Map<Integer, EntityTtnAlt> entityTtnMap = new HashMap<>();

    public EntityTtnAlt insertEntityTtn (EntityTtnAlt entityTtnAlt){
        entityTtnAlt.setId(ttnId++);
        entityTtnMap.put(entityTtnAlt.getId(), entityTtnAlt);
        return entityTtnAlt;
    }

    public EntityTtnAlt findEntityTtnId (Integer id){
        return entityTtnMap.get(id);
    }

    public int getEntityTtnMapSize() {
        return entityTtnMap.size();
    }

    public EntityTtnAlt findEntityTtnName(String name) {
        return entityTtnMap.get(name);
    }
}
