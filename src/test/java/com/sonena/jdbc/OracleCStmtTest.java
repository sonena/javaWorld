package com.sonena.jdbc;

import com.sonena.Employee;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OracleCStmtTest {

    private OracleCStmt cStmt;

    @Before
    public void init() {
        cStmt = new OracleCStmt();
    }

    @Test
    public void testInsert() throws ParseException, SQLException, ClassNotFoundException {
        Employee employee = new Employee();
        employee.setEmpId(114);
        employee.setEmpSalary(67500);
        employee.setJobId("HR_REP");

        DateFormat df = new SimpleDateFormat("mm/dd/yyyy");

        Date startDate = df.parse("08/01/2003");
        Date endDate = df.parse("12/31/2009");

        employee.setStartDate(startDate);
        employee.setEndDate(endDate);
        employee.setDepartmentId(260);

        cStmt.insertEmployee(employee);
    }
}
