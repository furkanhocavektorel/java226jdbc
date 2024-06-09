package org.vektorel.repository;

import org.vektorel.entity.Employee;
import org.vektorel.utility.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
        finally {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return employee;
    }

    public Employee findEmployeeByName(String name){
        String sql = "select * from employees where first_name = '"+name+"'";

        Employee employee= new Employee();
        try (Connection conn = DbConnection.openConnection()) {
            PreparedStatement p = conn.prepareCall(sql);
            ResultSet set = p.executeQuery();

            while (set.next()){
                employee.setFirst_name(set.getString("first_name"));
                employee.setLast_name(set.getString("last_name"));
                employee.setTitle(set.getString("title"));
                employee.setBirth_date(set.getDate("birth_date"));
                employee.setEmployee_id(set.getShort("employee_id"));
            }
        } catch (SQLException e) {
            System.out.println("getname method, repo hata!!");
            e.printStackTrace();
        }
        return employee;
    }

    public List<Employee> findEmployeeList(){
        String sql= "select ad,soyad from employees";
        Connection c= DbConnection.openConnection();

        List<Employee> employees= new ArrayList<>();

        try {
            PreparedStatement p=c.prepareStatement(sql);
            ResultSet set=p.executeQuery();
            while (set.next()){
                Employee employee= new Employee();
                employee.setFirst_name(set.getString("first_name"));
                employee.setLast_name(set.getString("last_name"));
                employee.setTitle(set.getString("title"));
                employee.setBirth_date(set.getDate("birth_date"));
                employee.setEmployee_id(set.getShort("employee_id"));
                employees.add(employee);

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                c.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return employees;
    }


    public List<Employee> findEmployeeList(){
        String sql= "select title,birthdate from employees";
        Connection c= DbConnection.openConnection();

        List<Employee> employees= new ArrayList<>();

        try {
            PreparedStatement p=c.prepareStatement(sql);
            ResultSet set=p.executeQuery();
            while (set.next()){
                Employee employee= new Employee();
                employee.setFirst_name(set.getString("first_name"));
                employee.setLast_name(set.getString("last_name"));
                employee.setTitle(set.getString("title"));
                employee.setBirth_date(set.getDate("birth_date"));
                employee.setEmployee_id(set.getShort("employee_id"));
                employees.add(employee);

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                c.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return employees;
    }


}
