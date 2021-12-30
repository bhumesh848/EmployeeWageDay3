package com.bridge.javafundamentals;


import java.lang.Math;

public class EmployeeWage {

    public static final int EMPLOYEE_WAGE_PER_HOUR =20;
    public static final  int FULL_DAY_HOUR = 8;
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

        int dailyWage = EMPLOYEE_WAGE_PER_HOUR * FULL_DAY_HOUR;
                System.out.println("Daily employee wage is :" + dailyWage);
                UC3();
    }
    static void UC3(){
        Employee partTimeEmployee = new Employee();
        partTimeEmployee.jobType = "part Time";
        partTimeEmployee.wage = 15;
        partTimeEmployee.numberOfHours = 8;
        partTimeEmployee.totalWage =  partTimeEmployee.numberOfHours * partTimeEmployee.wage;
        System.out.println("Total part time Wage: "+ partTimeEmployee.totalWage);

    }
}

