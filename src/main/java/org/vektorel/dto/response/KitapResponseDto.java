package org.vektorel.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class KitapResponseDto {
    private String ad;
    private int sayfaSayi;
}
