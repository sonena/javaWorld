package com.sonena;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {

    private int empId;
    private Date startDate;
    private Date endDate;
    private String jobId;
    private long departmentId;
    private Department empDepartment;
    private long empSalary = 2000;

    public Employee() {
    }

    public Employee(int id, Department depart, long salary) {
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

  /*  @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId == employee.empId &&
                empSalary == employee.empSalary &&
                empDepartment == employee.empDepartment;
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, empDepartment, empSalary);

    }*/

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public long getStartDate() {
        return startDate.getTime();
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public long getEndDate() {
        return endDate.getTime();
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
    }

    public void setEmpDepartment(Department empDepartment) {
        this.empDepartment = empDepartment;
    }

    public long getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(long empSalary) {
        this.empSalary = empSalary;
    }
}