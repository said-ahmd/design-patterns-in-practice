package org.structural.adapter;

public class EmployeeAra  {
    int elId;
    String elAsmAlAwal;
    String elAsmAlAheer;

    public EmployeeAra(int elId, String elAsmAlAwal, String elAsmAlAheer) {
        this.elId = elId;
        this.elAsmAlAwal = elAsmAlAwal;
        this.elAsmAlAheer = elAsmAlAheer;
    }

    public int getElId() {
        return elId;
    }

    public String getElAsmAlAwal() {
        return elAsmAlAwal;
    }

    public String getElAsmAlAheer() {
        return elAsmAlAheer;
    }

    @Override
    public String toString() {
        return "EmployeeAra{" +
                "elId=" + elId +
                ", elAsmAlAwal='" + elAsmAlAwal + '\'' +
                ", elAsmAlAheer='" + elAsmAlAheer + '\'' +
                '}';
    }
}
