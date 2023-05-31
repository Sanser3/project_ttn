package com.myproject.project_ttn.cervice;

import com.myproject.project_ttn.order.OrderTtn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderTtnService {
    private OrderTtn orderTtn = new OrderTtn();

    public List<Integer> createListOrderService() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter order: ");
        int sizeListOrder = orderTtn.getListSize();
        List<Integer> listOrderTtn = new ArrayList<>(sizeListOrder);
        for (int i = 0; i < sizeListOrder; i++) {
            listOrderTtn.add(scanner.nextInt());
        }
        return listOrderTtn;
    }
}
