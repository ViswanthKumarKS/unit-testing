package org.example.unitTesting.unittesting.Bussiness;

import org.example.unitTesting.unittesting.Service.dataService;

public class BussinessImpl {

    private dataService DataService;

    public void setDataService(dataService dataService) {
        DataService = dataService;
    }

    public int calculateSum(int[] data) {
        int sum = 0;
        for (int value : data) {
            sum += value;
        }
        return sum;
    }

    public int calculateSumUsingData() {
        int sum=0;
        int[] data=DataService.retriveData();

        for (int value : data) {
            sum += value;
        }
        return sum;

        }

    public int calculateSumusingone() {
        int sum=0;
        int[] data=DataService.retriveData();

        for (int value : data) {
            sum += value;
        }
        return sum;

    }

    }
