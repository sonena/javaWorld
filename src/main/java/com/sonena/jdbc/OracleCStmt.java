package com.sonena.jdbc;

import com.sonena.Employee;

import java.sql.*;

public class OracleCStmt {

    protected Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "1234");
        conn.setAutoCommit(true);
        return conn;
    }

    public void insertEmployee(Employee e) throws ClassNotFoundException, SQLException {
        Connection connection = getConnection();

        CallableStatement cstmt = connection.prepareCall("{call add_job_history(?,?,?,?,?)}");

        cstmt.setInt("p_emp_id", e.getEmpId());
        cstmt.setDate("p_start_date", new Date(e.getStartDate()));
        cstmt.setDate("p_end_date", new Date(e.getEndDate()));
        cstmt.setString("p_job_id", e.getJobId());
        cstmt.setLong("p_department_id", e.getDepartmentId());
        cstmt.execute();
    }

}