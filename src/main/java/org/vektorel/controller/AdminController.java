package org.vektorel.controller;

import org.vektorel.dto.request.AdminSaveRequestDto;
import org.vektorel.service.AdminService;

public class AdminController {
    AdminService adminService;

    public AdminController() {
        this.adminService = new AdminService();
    }

    public void save(AdminSaveRequestDto requestDto){
        adminService.save(requestDto);
    }

    public void delete(long id){
        adminService.delete(id);
    }
}
