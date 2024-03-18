package org.example.unitTesting.unittesting.Data;

import org.example.unitTesting.unittesting.Model.item;
import org.example.unitTesting.unittesting.Repository.ItemRepository;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.junit.jupiter.MockitoExtension;

import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;


import java.util.List;


import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@WebMvcTest(ItemRepository.class)
public class dataRepositoryTest {

    @MockBean
    private ItemRepository itemRepository;


    @Test
    public void testRepository(){
        List<item> items=itemRepository.findAll();
        assertEquals(0,items.size());
    }
}
