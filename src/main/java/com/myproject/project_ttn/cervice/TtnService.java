package com.myproject.project_ttn.cervice;

import com.myproject.project_ttn.order.OrderTtn;
import com.myproject.project_ttn.validation.TtnValidationService;
import com.myproject.project_ttn.entityTtn.EntityTtn;
import com.myproject.project_ttn.repository.TtnInRepository;

import java.util.List;
import java.util.Scanner;

public class TtnService {
    private TtnInRepository repository = new TtnInRepository();
    private TtnValidationService ttnValidationService = new TtnValidationService();

    public Integer createTtn(EntityTtn entityTtn){
        ttnValidationService.validate(entityTtn);
        EntityTtn createTtn = repository.insertEntityTtn(entityTtn);
        return createTtn.getId();
    }

    public EntityTtn findTtnId(Integer id){
        return repository.findEntityTtnId(id);
    }

    public void updateListOrderTtn(){
        System.out.println("Enter order: ");
        OrderTtn orderTtn = new OrderTtn();
        int sizeListOrder = orderTtn.getListOrderTtn().size();
        List<Integer> listOrderTtn = orderTtn.getListOrderTtn();
        for (int i = 0; i < sizeListOrder; i++) {
            Scanner scanner = new Scanner(System.in);
            listOrderTtn.add(scanner.nextInt());
        }
    }
}
