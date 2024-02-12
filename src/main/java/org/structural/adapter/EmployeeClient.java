package org.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
    int id;
    String firstName;
    String lastName;


    public List<Employee> getEmployeeList() {

        List<Employee> employees = new ArrayList<>();
        Employee EmployeeDB = new EmployeeDB(1,"said","ahmed");
        employees.add(EmployeeDB);

        // error it isn't implement Employee and, I don't want to change in legacy EmployeeAra
//        Employee employeeAra = new EmployeeAra(1,"mhmd","samy");
        //
        EmployeeAra employeeAra = new EmployeeAra(2,"mhmd","samy");
        Employee employeeFromAra = new EmployeeAraAdapter(employeeAra);
        employees.add(employeeFromAra);


        EmployeeCsv employeeCsv = new EmployeeCsv("3","khaled", "samer");
        Employee employeeFromCsv = new EmployeeCsvAdapter(employeeCsv);
        employees.add(employeeFromCsv);

        return employees;
    }
}
