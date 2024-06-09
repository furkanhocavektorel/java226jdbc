package org.vektorel.service;

import org.vektorel.entity.Employee;
import org.vektorel.repository.EmployeeRepository;

public class EmployeeService {

    public Employee getEmployeeById(short id){

        EmployeeRepository employeeRepository= new EmployeeRepository();

        return employeeRepository.getEmployeeById(id);

    }

}
