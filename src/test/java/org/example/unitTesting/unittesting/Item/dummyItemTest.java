package org.example.unitTesting.unittesting.Item;

import org.example.unitTesting.unittesting.Model.item;
import org.example.unitTesting.unittesting.controller.ItemController;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Arrays;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@ExtendWith(MockitoExtension.class)
@WebMvcTest(ItemController.class)
public class dummyItemTest {



    @Autowired
    MockMvc mockMvc;

    @MockBean
    org.example.unitTesting.unittesting.Service.itemService itemService;



    @Test
    public void test_item() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders
                .get("/dummy_item")
                .accept(MediaType.APPLICATION_JSON);
        MvcResult result = mockMvc.perform(request)
                .andExpect(status().isOk())
                .andReturn();
        assertEquals("{\"id\":1,\"name\":\"Bat\",\"price\":200,\"quantity\":250}",result.getResponse().getContentAsString());
    }




   
   // public void test_itemService() throws Exception {
   //     when(itemService.retriveHardCodedItem()).thenReturn(
   //             new item(2,"bowl",200,250)
   //     );
   //     RequestBuilder request = MockMvcRequestBuilders
   //             .get("/dummy_item_service")
   //             .accept(MediaType.APPLICATION_JSON);
   //     MvcResult result = mockMvc.perform(request)
   //             .andExpect(status().isOk())
   //             .andReturn();
   //     assertEquals("{\"id\":2,\"name\":\"bowl\",\"price\":200,\"quantity\":250}",result.getResponse().getContentAsString());

   // }

    @Test
    public void test_allitems() throws Exception {
        when(itemService.reteriveAllitems()).thenReturn(
                 Arrays.asList(new item(2,"bowl",200,250),
                         new item(3,"bat",20,25) )
        );
        RequestBuilder request = MockMvcRequestBuilders
                .get("/all-items")
                .accept(MediaType.APPLICATION_JSON);
        MvcResult result = mockMvc.perform(request)
                .andExpect(status().isOk())
                .andReturn();
        assertEquals("[{\"id\":2,\"name\":\"bowl\",\"price\":200,\"quantity\":250},{\"id\":3,\"name\":\"bat\",\"price\":20,\"quantity\":25}]",result.getResponse().getContentAsString());

    }
}
