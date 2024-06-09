package org.vektorel.entity;

import java.util.Date;

public class Employee {

    private Short employee_id;
    private String first_name;
    private String last_name;
    private String title;
    private Date birth_date;
    private String address;
    private Short reports_to;

    public Employee() {
    }

    public Employee(Short employee_id, String first_name, String last_name, String title, Date birth_date, String address, Short reports_to) {
        this.employee_id = employee_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.title = title;
        this.birth_date = birth_date;
        this.address = address;
        this.reports_to = reports_to;
    }

    public Short getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Short employee_id) {
        this.employee_id = employee_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Short getReports_to() {
        return reports_to;
    }

    public void setReports_to(Short reports_to) {
        this.reports_to = reports_to;
    }
}
