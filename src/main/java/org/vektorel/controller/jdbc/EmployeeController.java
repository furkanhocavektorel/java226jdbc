package org.vektorel.controller.jdbc;

import org.vektorel.dto.response.EmployeeByIdResponseDto;
import org.vektorel.dto.response.EmployeeListResponseDto;
import org.vektorel.entity.jdbc.Employee;
import org.vektorel.service.jdbc.EmployeeService;

import java.util.List;

public class EmployeeController {

    EmployeeService service;

    public EmployeeController() {
        this.service = new EmployeeService();
    }

    public EmployeeByIdResponseDto getEmployeeById(short id){
        return service.getEmployeeById(id);
    }


    //      !*******! ODEV !*******!
    //      bu method dto dönmeli
    public Employee getEmployeeByname(String name){
        return service.getEmployeeByName(name);
    }

    public List<EmployeeListResponseDto> getEmployees(){
        return service.getEmployeeList();
    }


}
