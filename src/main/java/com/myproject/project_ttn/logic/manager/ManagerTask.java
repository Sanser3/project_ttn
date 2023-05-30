package com.myproject.project_ttn.logic.manager;

import com.myproject.project_ttn.cervice.TtnService;
import com.myproject.project_ttn.entityTtn.EntityTtn;
import com.myproject.project_ttn.order.OrderTtn;

import java.util.List;
import java.util.Scanner;

public class ManagerTask {
    TtnService ttnService = new TtnService();
    public void managerTask() {
        System.out.println("++++++++++ManagerTask++++++++++");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("1. Create");
                System.out.println("2. Update");
                System.out.println("3. Delete");
                System.out.println("4. Find");
                System.out.println("5. Exit");
                int usIn = scanner.nextInt();

                switch (usIn) {
                    case 1:
                        System.out.println("Enter 1");
                        createTtnManager();
                        break;
                    case 2:
                        System.out.println("Enter 2");
                        updateTtnManager();
                        break;
                    case 3:
                        System.out.println("Enter 3");
                        deleteTtnManager();
                        break;
                    case 4:
                        System.out.println("Enter 4");
                        findTtnManager();
                        break;
                    case 5:
                        System.out.println("Enter 5");
                        return;
                }
            } catch (Exception e) {
                System.out.println("Error!");
            }
        }
    }

    private void createTtnManager() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scanner.nextLine();

        OrderTtn orderTtn = new OrderTtn();
        List<Integer> listOrder = orderTtn.getListOrderTtn();

        EntityTtn entityTtn = new EntityTtn();
        entityTtn.setName(name);
        entityTtn.setOrder(listOrder);


        Integer id = ttnService.createTtn(entityTtn);
        System.out.println("Result id: " + id);

    }
    private void findTtnManager() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id: ");
        Integer id = scanner.nextInt();

        EntityTtn entityTtn = ttnService.findTtnId(id);
        System.out.println(entityTtn);
    }
    private void updateTtnManager() {

    }

    private void deleteTtnManager() {

    }
}
