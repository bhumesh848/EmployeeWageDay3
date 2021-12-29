package com.bridge.javafundamentals;

import java.util.Random;
import java.lang.Math;

import static java.lang.Math.random;

public class EmployeeWage {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee wage Computation Program");
        double random = Math.random() * 2;
        System.out.println("random number generated is : " + random);
         int result = (int) random%2;
        System.out.println("result is :" + result);
         if (result==1)
             System.out.println("Employee is present");
         else{
             System.out.println("Employee is absent");
         }
    }
}

