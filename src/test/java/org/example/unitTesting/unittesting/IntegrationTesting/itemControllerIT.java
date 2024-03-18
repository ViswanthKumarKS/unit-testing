package org.example.unitTesting.unittesting.IntegrationTesting;

import org.json.JSONException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;


@ExtendWith(MockitoExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class itemControllerIT {

    @Autowired
    private TestRestTemplate testTemplate;

    @Test
    void contextLoads() throws JSONException {
        String response=this.testTemplate.getForObject("/all-items", String.class);
        JSONAssert.assertEquals("[{id:1},{id:2},{id:3}]",response,false);
    }

    @Test
    void dummyitem() throws JSONException {
        String response=this.testTemplate.getForObject("/dummy_item",String.class);
        JSONAssert.assertEquals("{\"id\":1,\"name\":\"Bat\",\"price\":200,\"quantity\":250}",response,false);
    }

    @Test
    void helloWorld() throws JSONException {
        String response=testTemplate.getForObject("/hello_world", String.class);
        JSONAssert.assertEquals(" ",response,false);
    }



}
