package com.sonena;

import java.util.Objects;

public class BadEmployee extends Employee {

    public BadEmployee(int id, Department depart, long salary) {
        super(id, depart, salary);
    }

    /*@Override
    public int hashCode() {
        System.out.println("In HashCode");
        return 0;
    }*/

    @Override
    public boolean equals(Object obj) {
        return true;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}