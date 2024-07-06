package org.vektorel.service;

import org.vektorel.dto.request.AdminSaveRequestDto;
import org.vektorel.entity.Admin;
import org.vektorel.entity.Iletisim;
import org.vektorel.repository.AdminRepository;

public class AdminService {
    AdminRepository adminRepository;

    public AdminService() {
        this.adminRepository = new AdminRepository();
    }

    public void save(AdminSaveRequestDto dto){
        adminRepository.save(Admin.builder()
                        .ad(dto.getAd())
                        .cinsiyet(dto.getCinsiyet())
                        .iletisim(Iletisim.builder()
                                .mail(dto.getEmail())
                                .twitter(dto.getTwitter())
                                .build())
                .build());

    }

    public void delete(long id){
        Admin admin=adminRepository.findById(id);
        adminRepository.Delete(admin);
    }


}
