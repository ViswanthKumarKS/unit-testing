package org.example.unitTesting.unittesting.Bussiness;

import org.example.unitTesting.unittesting.Service.dataService;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)

public class TestBussinessMock {

    @InjectMocks
    BussinessImpl bussiness;

    @Mock
    dataService dataService;





    @Test
    public void calculateSumUsingData(){
        when(dataService.retriveData()).thenReturn(new int[] {1,2,3});
        bussiness.setDataService(dataService);
        assertEquals(bussiness.calculateSumUsingData(), 6);



    }
    @Test
    public void calculateSumusingone(){

        when(dataService.retriveData()).thenReturn(new int[] {5});
        bussiness.setDataService(dataService);
        assertEquals(bussiness.calculateSumusingone(), 5);



    }
}
