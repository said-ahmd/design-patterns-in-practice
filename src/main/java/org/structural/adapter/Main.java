package org.structural.adapter;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeClient employeeClient = new EmployeeClient();
        List<Employee> employees = employeeClient.getEmployeeList();
        System.out.println(employees);

    }
}
