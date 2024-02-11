package src.application;

import src.practice.generic.Mydata;

public class GenericClassApp {

    public static void main(String[] args) {
        
        Mydata<String> stringMydata = new Mydata<String>("Hello");
        Mydata<Integer> integrMydata = new Mydata<Integer>(1);

        String stringValue = stringMydata.getData();
        Integer integerValue = integrMydata.getData();

        System.out.println(stringValue);
        System.out.println(integerValue);
    }
}   
