package org.example.unitTesting.unittesting.Service;

import org.example.unitTesting.unittesting.Model.item;
import org.example.unitTesting.unittesting.Repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class itemService {

    @Autowired
    private ItemRepository itemRepository;

//     public item retriveHardCodedItem(){
//
//         return new item(1,"ball",100,200);
//    }

    public List<item> reteriveAllitems(){
         List<item> items=itemRepository.findAll();
//         for(item item:items){
//             item.setValue(item.getPrice() * item.getQuantity());
//
//         }
         return items;
    }





}
