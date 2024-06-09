package org.vektorel.service;

import org.vektorel.dto.response.EmployeeByIdResponseDto;
import org.vektorel.dto.response.EmployeeListResponseDto;
import org.vektorel.entity.Employee;
import org.vektorel.repository.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    EmployeeRepository employeeRepository;

    public EmployeeService() {
        this.employeeRepository = new EmployeeRepository();
    }

    public EmployeeByIdResponseDto getEmployeeById(short id){

        EmployeeByIdResponseDto responseDto = new EmployeeByIdResponseDto();
        Employee e=employeeRepository.getEmployeeById(id);

        responseDto.setName(e.getFirst_name());
        responseDto.setSurname(e.getLast_name());

        return responseDto;
    }

    public Employee getEmployeeByName(String name){

        return employeeRepository.findEmployeeByName(name);
    }

    public List<EmployeeListResponseDto> getEmployeeList(){
        List<EmployeeListResponseDto> responses = new ArrayList<>();

        List<Employee> employees=employeeRepository.findEmployeeList();

        for (Employee e :employees){

            EmployeeListResponseDto dto= new EmployeeListResponseDto();

            dto.setName(e.getFirst_name());
            dto.setTitle(e.getTitle());
            dto.setBirth_date(e.getBirth_date());

            responses.add(dto);
        }


        return responses;
    }

}
