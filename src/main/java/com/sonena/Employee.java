package com.sonena;

import java.io.Serializable;

public class Employee implements Serializable {

    private long empId;
    private Department empDepartment;
    private long empSalary = 2000;

    public Employee(long id, Department depart, long salary) {
        empId = id;
        empDepartment = depart;
        empSalary = salary;

        if (empId <= 0 || empDepartment == null || empSalary == 0) {
            throw new RuntimeException("Employee Information is not correct");
        }
    }

    public Department getEmpDepartment() {
        return empDepartment;
    }

    public long salaryRaise(long raiseAmount) {
        if (raiseAmount >= empSalary) {
            empSalary += raiseAmount;
        } else {
            System.out.println("Raise Amount is less that salary,no Raise is given to the employee ");
        }
        return empSalary;
    }
}