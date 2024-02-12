package org.structural.adapter;

public class EmployeeCsv {
    String id;
    String name;
    String L_name;

    public EmployeeCsv(String id, String name, String l_name) {
        this.id = id;
        this.name = name;
        L_name = l_name;
    }


    @Override
    public String toString() {
        return "EmployeeCsv{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", L_name='" + L_name + '\'' +
                '}';
    }
}
