package com.SpringBootWebApp.Model;

import org.springframework.stereotype.Repository;


@Repository
public class EmployeeDAO 
{
    private static Employees list = new Employees();
     
    static
    {
        list.getEmployeeList().add(new Employee(1, "Lokesh", "Gupta", "howtodoinjava@gmail.com"));
        list.getEmployeeList().add(new Employee(2, "Alex", "Kolenchiskey", "abc@gmail.com"));
        list.getEmployeeList().add(new Employee(3, "David", "Kameron", "titanic@gmail.com"));
        list.getEmployeeList().add(new Employee(4, "Jon", "Deadbolt", "jbolt@gmail.com"));
        list.getEmployeeList().add(new Employee(5, "Big", "Daddy", "bigDad@gmail.com"));
    }
     
    public Employees getAllEmployees() 
    {
        return list;
    }
    
    public Employees searchByName(String substring) 
    {
        return list.searchByName(substring, list);
    }
     
    public void addEmployee(Employee employee) 
    {
        list.getEmployeeList().add(employee);
    }
}
