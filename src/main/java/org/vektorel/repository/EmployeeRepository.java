package org.vektorel.repository;

import org.vektorel.entity.Employee;
import org.vektorel.utility.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmployeeRepository {

    public Employee getEmployeeById(short employee_id){
        String sql="select * from employees where employee_id = (?)";

        Employee employee=new Employee();

        Connection conn= DbConnection.openConnection();

        try {
            PreparedStatement p= conn.prepareStatement(sql);
            p.setShort(1,employee_id);
            ResultSet resultset=p.executeQuery();

            while (resultset.next()){
                employee.setEmployee_id(resultset.getShort("employee_id"));
                employee.setFirst_name(resultset.getString("first_name"));
                employee.setBirth_date(resultset.getDate("birth_date"));
                employee.setLast_name(resultset.getString("last_name"));
                employee.setReports_to(resultset.getShort("reports_to"));
            }

        }catch (Exception e){
            System.out.printf("calisan getirme metodu sıkıntılı");
            e.printStackTrace();

        }

        return employee;

    }

}
