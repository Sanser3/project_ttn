package com.myproject.project_ttn.repository;

import com.myproject.project_ttn.cervice.OrderTtnService;
import com.myproject.project_ttn.entityTtn.EntityTtn;
import com.myproject.project_ttn.order.OrderTtn;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TtnInRepository {
    private OrderTtn orderTtn = new OrderTtn();
    private OrderTtnService orderTtnService = new OrderTtnService();
    private Map<String, OrderTtn> ttnMap = new HashMap<>();

    public EntityTtn insertEntityTtn (EntityTtn entityTtn){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        entityTtn.setName(name);
        entityTtn.setOrder(orderTtnService.createListOrderService());
        ttnMap.put(entityTtn.getName(), (OrderTtn) entityTtn.getOrder());
        return entityTtn;
    }

}
