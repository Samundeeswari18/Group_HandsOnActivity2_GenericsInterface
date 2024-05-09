package com.sam.GenericInterface;

public class GenericInterfaceClass {
    public void lambdaFunction(){
    GroupOneFunctionalInterface<String,Integer> obj=(x)-> {

            return x.length();

    };
        System.out.println("The Length of the string is: "
                +obj.transform("PerScholas"));
}}
