package org.vektorel.service;

import org.vektorel.dto.request.KitapSaveRequestDto;
import org.vektorel.dto.request.KitapUpdateRequestDto;
import org.vektorel.dto.response.KitapResponseDto;
import org.vektorel.entity.Kitap;
import org.vektorel.repository.KitapRepository;

import java.util.ArrayList;
import java.util.List;

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
    public KitapResponseDto findById(long id){
        Kitap kitap=kitapRepository.findById(id);
        return KitapResponseDto.builder()
                .sayfaSayi(kitap.getSayfaSayisi())
                .ad(kitap.getAd())
                .build();
    }

    public List<KitapResponseDto> findAll(){
        List<Kitap> kitapList=kitapRepository.findAll();

        List<KitapResponseDto> responses= new ArrayList<>();

        for (Kitap kitap: kitapList) {
            responses.add(KitapResponseDto.builder()
                            .ad(kitap.getAd())
                            .sayfaSayi(kitap.getSayfaSayisi())
                    .build());
        }
        return responses;

    }

    public void delete(long id){
        Kitap kitap=kitapRepository.findById(id);
        kitapRepository.delete(kitap);
    }

    public void update(KitapUpdateRequestDto dto){
        Kitap kitap= kitapRepository.findById(dto.getId());
        kitap.setSayfaSayisi(dto.getYeniSayfaSayisi());
        kitapRepository.update(kitap);
    }

}
