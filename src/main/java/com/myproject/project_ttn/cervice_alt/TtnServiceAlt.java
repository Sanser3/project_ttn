package com.myproject.project_ttn.cervice_alt;

import com.myproject.project_ttn.validation_alt.TtnValidationServiceAlt;
import com.myproject.project_ttn.entityTtn_alt.EntityTtnAlt;
import com.myproject.project_ttn.repository_alt.TtnInRepositoryAlt;

import java.util.Scanner;

public class TtnServiceAlt {
    private TtnInRepositoryAlt repository = new TtnInRepositoryAlt();
    private TtnValidationServiceAlt ttnValidationService = new TtnValidationServiceAlt();

    public Integer createTtn(EntityTtnAlt entityTtnAlt){
        ttnValidationService.validate(entityTtnAlt);
        EntityTtnAlt createTtn = repository.insertEntityTtn(entityTtnAlt);
        return createTtn.getId();
    }

    public EntityTtnAlt findTtnId(Integer id){
        return repository.findEntityTtnId(id);
    }

    public EntityTtnAlt findTtnName(String name){
        int index = 0;

//        int sizeTtn = repository.getEntityTtnMapSize();
//        for (int i = 0; i < sizeTtn; i++) {
//            if (name.equals(repository.findEntityTtnName(name))){
//                EntityTtn entityTtn = findTtnId(i);
//                System.out.println(entityTtn);
//                index = i;
//            }
//
//        }
        return repository.findEntityTtnId(index);
    }

    public void findAllSizeTtn(){
        int sizeTtn = repository.getEntityTtnMapSize();
        for (int i = 0; i < sizeTtn; i++) {
            EntityTtnAlt entityTtnAlt = findTtnId(i);
            System.out.println(entityTtnAlt);
        }
    }

    public void updateListOrderTtn(){
        System.out.println("Enter name Order: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();


        System.out.println("updateListOrderTtn = " + name);

    }
}
