package com.sonena;

import org.junit.Assert;
import org.junit.Test;

public class EmployeeTest {

    @Test
    public void testValidSalaryRaise() {
        Employee empObj1 = new Employee(123456, Department.ACCOUNTING, 2000);
        long actualSalary = empObj1.salaryRaise(2000);
        long expectedSalary = 4000;
        System.out.println(actualSalary);
        Assert.assertEquals(expectedSalary, actualSalary);
    }

    @Test
    public void testInvalidSalaryRaise() {
        Employee empObj1 = new Employee(123456, Department.ACCOUNTING, 2000);
        long actualSalary = empObj1.salaryRaise(1000);
        long expectedSalary = 2000;
        System.out.println(actualSalary);
        Assert.assertEquals(expectedSalary, actualSalary);
    }

    @Test(expected = RuntimeException.class)
    public void testInvalidDepartment() {
        Employee empObj1 = new Employee(-10000, Department.ACCOUNTING, 2000);
        System.out.println(empObj1);
    }

    @Test
    public void testDepartmentIllegalAccess() {
        Employee empObj1 = new Employee(-10000, Department.ACCOUNTING, 2000);
        System.out.println(empObj1.getEmpDepartment());
    }

    @Test
    public void testFinalEmployee() {
        final Employee employee = new Employee(10000, Department.ACCOUNTING, 2000);
        Employee clone = new Employee(10000, Department.ACCOUNTING, 2000);
        System.out.println(employee);
        System.out.println(clone);
    }
}
