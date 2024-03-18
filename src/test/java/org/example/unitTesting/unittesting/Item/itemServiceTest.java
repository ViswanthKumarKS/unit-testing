package org.example.unitTesting.unittesting.Item;

import org.example.unitTesting.unittesting.Model.item;
import org.example.unitTesting.unittesting.Repository.ItemRepository;
import org.example.unitTesting.unittesting.Service.itemService;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)

public class itemServiceTest {

    @InjectMocks
    itemService itemService;

    @Mock
    ItemRepository itemRepository;


    @Test
    public void itemServiceTest(){

        when(itemRepository.findAll()).thenReturn(Arrays.asList(new item(2,"bowl",20,10),
                new item(3,"bat",20,5)));

        List<item> items= itemService.reteriveAllitems();
//        assertEquals(200,items.get(0).getValue());
//        assertEquals(100,items.get(1).getValue());



    }
}
