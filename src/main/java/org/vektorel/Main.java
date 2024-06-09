package org.vektorel;

import org.vektorel.controller.EmployeeController;
import org.vektorel.entity.Employee;

public class Main {
    public static void main(String[] args) {

        EmployeeController controller= new EmployeeController();
        Employee e=controller.getEmployeeById((short) 7);

        System.out.println(e.getBirth_date());
        System.out.println(e.getFirst_name());
        System.out.println(e.getReports_to());




    }
}
