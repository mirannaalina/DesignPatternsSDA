package com.company.STRUCTURALPatterns.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    //leader si lista de angajati
    //ierarhie. colectie de mai multe obiecte de acelasi fel pe alta scara ierarhica

    //colectii de acelasi fel

    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;


    public Employee(String name, String dept, int salary){
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subordinates = new ArrayList<Employee>();
    }

    public void add (Employee e ) {subordinates.add(e);}

    public List<Employee> getSubordinates() { return subordinates; }
    public String toString(){
        return ("Employee: NAme : "+name + "Dept: " +dept + "Salary : "+salary);
    }
}
