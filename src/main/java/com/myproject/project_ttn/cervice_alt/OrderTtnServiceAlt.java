package com.myproject.project_ttn.cervice_alt;

import com.myproject.project_ttn.order_alt.OrderTtnAlt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderTtnServiceAlt {
    private OrderTtnAlt orderTtn = new OrderTtnAlt();

    public List<Integer> createListOrderService() {
        System.out.println("Enter order: ");
        int sizeListOrder = orderTtn.getListOrderTtnSize();
        List<Integer> listOrderTtn = new ArrayList<>(sizeListOrder);
        for (int i = 0; i < sizeListOrder; i++) {
            Scanner scanner = new Scanner(System.in);
            listOrderTtn.add(scanner.nextInt());
        }
        return listOrderTtn;
    }
}