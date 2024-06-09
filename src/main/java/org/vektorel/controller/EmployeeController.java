package org.vektorel.controller;

import org.vektorel.entity.Employee;
import org.vektorel.service.EmployeeService;

public class EmployeeController {

    public Employee getEmployeeById(short id){

        EmployeeService service= new EmployeeService();

        return service.getEmployeeById(id);

    }

}
