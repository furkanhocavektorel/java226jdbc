package org.vektorel.dto.request;

import lombok.*;

import java.util.Date;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class KitapSaveRequestDto {
    private String kitapAdi;
    private int sayfaSayisi;
    private Date cikisYili;
}
