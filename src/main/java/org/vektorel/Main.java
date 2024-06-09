package org.vektorel;

import org.vektorel.controller.EmployeeController;
import org.vektorel.dto.response.EmployeeByIdResponseDto;
import org.vektorel.entity.Employee;

public class Main {
    public static void main(String[] args) {

        EmployeeController controller= new EmployeeController();
        EmployeeByIdResponseDto dto=controller.getEmployeeById((short) 7);

        System.out.println("************************");
        System.out.println(dto.getName());
        System.out.println(dto.getSurname());
        System.out.println("************************");

        Employee e2= controller.getEmployeeByname("furkan");
        System.out.println(e2);

        controller.getEmployees().forEach(System.out::println);

    }
}
