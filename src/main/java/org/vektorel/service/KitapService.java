package org.vektorel.service;

import org.vektorel.dto.request.KitapSaveRequestDto;
import org.vektorel.entity.Kitap;
import org.vektorel.repository.KitapRepository;

public class KitapService {
    KitapRepository kitapRepository;

    public KitapService() {
        this.kitapRepository = new KitapRepository();
    }

    public void save(KitapSaveRequestDto dto){
        kitapRepository.save(Kitap.builder()
                .ad(dto.getKitapAdi())
                .baskiYili(dto.getCikisYili())
                .sayfaSayisi(dto.getSayfaSayisi())
                .build());
    }


}
