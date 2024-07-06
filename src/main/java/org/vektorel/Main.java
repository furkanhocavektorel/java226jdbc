package org.vektorel;

import org.vektorel.controller.AdminController;
import org.vektorel.controller.KitapController;
import org.vektorel.controller.jdbc.EmployeeController;
import org.vektorel.dto.request.AdminSaveRequestDto;
import org.vektorel.dto.request.KitapSaveRequestDto;
import org.vektorel.dto.response.EmployeeByIdResponseDto;
import org.vektorel.entity.Admin;
import org.vektorel.entity.Cinsiyet;
import org.vektorel.entity.jdbc.Employee;
import org.vektorel.repository.AdminRepository;
import org.vektorel.repository.KitapRepository;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

/*        EmployeeController controller= new EmployeeController();
        EmployeeByIdResponseDto dto=controller.getEmployeeById((short) 7);

        System.out.println("************************");
        System.out.println(dto.getName());
        System.out.println(dto.getSurname());
        System.out.println("************************");

        Employee e2= controller.getEmployeeByname("furkan");
        System.out.println(e2);

        controller.getEmployees().forEach(System.out::println);*/

/*        KitapController kitapController= new KitapController();
        KitapSaveRequestDto requestDto= new KitapSaveRequestDto();

        requestDto.setCikisYili(new Date());
        requestDto.setKitapAdi("LOTR");
        requestDto.setSayfaSayisi(1000);

        kitapController.saveKitap(requestDto);*/

    /*    AdminController adminController= new AdminController();
        adminController.save(AdminSaveRequestDto.builder()
                        .email("admin@gmail.com")
                        .twitter("admin@twitter.com")
                        .ad("can")
                        .cinsiyet(Cinsiyet.ERKEK)
                .build());*/

        //KitapRepository kitapRepository= new KitapRepository();

 /*       System.out.println("*** KİTAP LİSTESİ***");
        kitapRepository.findAll().forEach(System.out::println);
        System.out.println("*** KİTAP LİSTESİ SON***");

        System.out.println("\n *** 2 idli kitap***");
        System.out.println(kitapRepository.findById(2));
        System.out.println(" *** 2 idli kitap SON***");

        kitapRepository.delete(kitapRepository.findById(1));*/

        //kitapRepository.findByNameHqlQuery("Hobbit").forEach(System.out::println);

        AdminRepository adminRepository= new AdminRepository();

        System.out.println(adminRepository.findById(1l));


    }
}
