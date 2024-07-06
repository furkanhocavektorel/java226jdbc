package org.vektorel.controller;

import org.vektorel.dto.request.KitapSaveRequestDto;
import org.vektorel.dto.request.KitapUpdateRequestDto;
import org.vektorel.dto.response.KitapResponseDto;
import org.vektorel.service.KitapService;

import java.util.List;

public class KitapController {
    KitapService kitapService;

    public KitapController() {
        this.kitapService = new KitapService();
    }

    public void saveKitap(KitapSaveRequestDto request){
        kitapService.save(request);
    }

    public KitapResponseDto findById(long id){
       return kitapService.findById(id);
    }

    public void update (KitapUpdateRequestDto dto){
        kitapService.update(dto);
    }

    public List<KitapResponseDto> findAll(){
        return kitapService.findAll();
    }

    public void delete(long id){
        kitapService.delete(id);
    }


}
