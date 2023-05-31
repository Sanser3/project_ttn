package com.myproject.project_ttn.entityTtn;

import java.util.List;

public class EntityTtn {
    private String name;
    private List<Integer> order;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getOrder() {
        return order;
    }

    public void setOrder(List<Integer> order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "EntityTtn{" +
                "name='" + name + '\'' +
                ", order=" + order +
                '}';
    }
}
