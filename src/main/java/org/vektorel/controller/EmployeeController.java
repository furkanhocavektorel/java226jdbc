package org.vektorel.controller;

import org.vektorel.dto.response.EmployeeByIdResponseDto;
import org.vektorel.dto.response.EmployeeListResponseDto;
import org.vektorel.entity.Employee;
import org.vektorel.service.EmployeeService;

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
