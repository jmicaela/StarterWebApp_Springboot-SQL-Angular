package com.SpringBootWebApp.Model;
import java.util.ArrayList;
import java.util.List;
 
public class Employees 
{
    private List<Employee> employeeList;
     
    public List<Employee> getEmployeeList() {
        if(employeeList == null) {
            employeeList = new ArrayList<>();
        }
        return employeeList;
    }
  
    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
    
    public Employees searchByName(String substr, Employees employeeList) {
    	Employees output = new Employees();
    	List<Employee> searchMatches = new ArrayList<Employee>();
    	
    	List<Employee> list = employeeList.employeeList;
    	for (Employee e : list) {
    		if (e.getFirstName().contains(substr) || e.getLastName().contains(substr)) {
    			searchMatches.add(new Employee(e.getId(), e.getFirstName(), e.getLastName(), e.getEmail()));
    		}
    	}
    	
    	output.setEmployeeList(searchMatches);
    	return output;
    }
}