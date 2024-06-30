package org.vektorel.controller;

import org.vektorel.dto.request.KitapSaveRequestDto;
import org.vektorel.service.KitapService;

public class KitapController {
    KitapService kitapService;

    public KitapController() {
        this.kitapService = new KitapService();
    }

    public void saveKitap(KitapSaveRequestDto request){
        kitapService.save(request);
    }

}
