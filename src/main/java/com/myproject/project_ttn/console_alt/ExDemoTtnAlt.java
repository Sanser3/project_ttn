package com.myproject.project_ttn.console_alt;

import com.myproject.project_ttn.logic_alt.customer_alt.CustomerTaskAlt;
import com.myproject.project_ttn.logic_alt.driver_alt.DriverTaskAlt;
import com.myproject.project_ttn.logic_alt.manager_alt.ManagerTaskAlt;

import java.util.Scanner;

public class ExDemoTtnAlt {
    public static void main(String[] args) {

        ManagerTaskAlt managerTask = new ManagerTaskAlt();
        DriverTaskAlt driverTask = new DriverTaskAlt();
        CustomerTaskAlt customerTask = new CustomerTaskAlt();

        System.out.println("++++++++++MenuTask++++++++++");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("1. Manager");
                System.out.println("2. Driver");
                System.out.println("3. Customer");
                System.out.println("4. Exit");
                int usIn = scanner.nextInt();

                switch (usIn) {
                    case 1:
                        System.out.println("Enter 1");
                        managerTask.managerTask();
                        break;
                    case 2:
                        System.out.println("Enter 2");
                        driverTask.driverTask();
                        break;
                    case 3:
                        System.out.println("Enter 3");
                        customerTask.customerTask();
                        break;
                    case 4:
                        System.out.println("Enter 4");
                        return;
                }
            } catch (Exception e) {
                System.out.println("Error!");
            }
//            scanner.close();
        }

    }
}
