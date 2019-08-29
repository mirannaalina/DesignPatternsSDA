package com.company.STRUCTURALPatterns.CompositePattern;

public class Main {

    public static void main(String[] args) {


        Employee CEO = new Employee("Richard", "Sales",10000);
        Employee headSales = new Employee("Cristi", "Sales",9000);
        Employee clerk1 = new Employee("Daniel", "Marketing",8000);
        Employee clerk2 = new Employee("Victor", "Sales",2000);
        Employee salesExecutive1 = new Employee("Roland", "Sales",3000);
        Employee salesExecutive2 = new Employee("Gem", "Sales",9000);
        Employee headMarketing = new Employee("CArl", "Marketing",3000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        for (Employee e : CEO.getSubordinates()){
            System.out.println(e);
            for(Employee emp : e.getSubordinates()){
                System.out.println(emp);
            }
        }



    }
}
