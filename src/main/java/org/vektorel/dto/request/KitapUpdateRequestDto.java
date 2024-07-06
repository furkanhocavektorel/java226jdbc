package org.vektorel.dto.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class KitapUpdateRequestDto {
    private long id;
    private int yeniSayfaSayisi;
}
