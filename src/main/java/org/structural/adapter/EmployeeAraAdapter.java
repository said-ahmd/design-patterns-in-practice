package org.structural.adapter;

public class EmployeeAraAdapter implements Employee {
    EmployeeAra employeeAra;
    public EmployeeAraAdapter(EmployeeAra employeeAra) {
        this.employeeAra=employeeAra;
    }

    @Override
    public int getId() {
        return employeeAra.elId;
    }

    @Override
    public String getFirstName() {
        return employeeAra.elAsmAlAwal;
    }

    @Override
    public String getLastName() {
        return employeeAra.elAsmAlAheer;
    }

}
