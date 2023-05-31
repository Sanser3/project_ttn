package com.myproject.project_ttn.order;

import java.util.ArrayList;
import java.util.List;

public class OrderTtn {
    private int listSize = 5;
    private List<Integer> order = new ArrayList<>(listSize);

    public int getListSize() {
        return listSize;
    }

    public List<Integer> getOrder() {
        return order;
    }

    public void setOrder() {
        this.order = order;
    }


}
