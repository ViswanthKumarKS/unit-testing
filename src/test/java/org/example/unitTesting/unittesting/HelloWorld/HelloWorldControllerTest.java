package org.example.unitTesting.unittesting.HelloWorld;

import org.example.unitTesting.unittesting.controller.HelloWorldController;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(MockitoExtension.class)
@WebMvcTest(HelloWorldController.class)
public class HelloWorldControllerTest {


    @Autowired
    private MockMvc mockMvc;

    @Test
    public void test_basic() throws Exception {
        RequestBuilder requestBuilder= MockMvcRequestBuilders
                .get("/hello_world")
                .accept(MediaType.APPLICATION_JSON);
       MvcResult result= mockMvc.perform(requestBuilder)
               .andExpect(status().isOk())

               .andReturn();
       assertEquals("hello world",result.getResponse().getContentAsString());

    }




    }

