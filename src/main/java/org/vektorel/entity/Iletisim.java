package org.vektorel.entity;

import jakarta.persistence.Embeddable;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Embeddable
public class Iletisim {
    private String fax;
    private String mail;
    private String instragram;
    private String webSite;
    private String twitter;
    private String adres;
}
