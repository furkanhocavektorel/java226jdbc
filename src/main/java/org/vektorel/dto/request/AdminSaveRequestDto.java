package org.vektorel.dto.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.vektorel.entity.Cinsiyet;

@Getter
@Setter
@Builder
public class AdminSaveRequestDto {

    private String ad;
    private String email;
    private String twitter;
    private Cinsiyet cinsiyet;

}
