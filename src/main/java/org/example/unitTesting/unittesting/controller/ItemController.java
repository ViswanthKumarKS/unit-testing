package org.example.unitTesting.unittesting.controller;

import org.example.unitTesting.unittesting.Model.item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    private org.example.unitTesting.unittesting.Service.itemService itemService;

    @GetMapping("/dummy_item")
    public item dummyItem(){
        return new item(1,"Bat",200,250);
    }



//    @GetMapping("/dummy_item_service")
//    public  item dummyItemService(){
//
//    return itemService.retriveHardCodedItem();
//    }

    @GetMapping("/all-items")
    public List<item> reteriveallItems(){
        return itemService.reteriveAllitems();
    }

}


