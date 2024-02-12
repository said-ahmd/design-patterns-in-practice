package org.structural.adapter;

public class EmployeeCsvAdapter implements Employee {
    EmployeeCsv employeeCsv;
    public EmployeeCsvAdapter(EmployeeCsv employeeCsv) {
        this.employeeCsv=employeeCsv;
    }

    @Override
    public int getId() {
        return  Integer.parseInt(employeeCsv.id);
    }

    @Override
    public String getFirstName() {
        return employeeCsv.name;
    }

    @Override
    public String getLastName() {
        return employeeCsv.L_name;
    }
    
}
