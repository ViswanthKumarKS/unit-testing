package org.example.unitTesting.unittesting.Bussiness;

import org.example.unitTesting.unittesting.Service.dataService;
import org.junit.jupiter.api.Test;

import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class Testbussiness {

    @Mock
    dataService dataService;

    @Test
    void calculateSum_basic(){
        BussinessImpl bussiness=new BussinessImpl();
       int actualResult=bussiness.calculateSum(new int[] {1,2,3});
       int expectedResult=6;
       assertEquals(actualResult,expectedResult);



    }
    @Test
    void calculateSumusingone(){
        BussinessImpl bussiness=new BussinessImpl();
        int actualResult=bussiness.calculateSum(new int[] {10});
        int expectedResult=10;
        assertEquals(actualResult,expectedResult);



    }
}
