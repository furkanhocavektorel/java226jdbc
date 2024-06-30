package org.vektorel.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tbladmin")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(
            name = "admin_adi",// db de ki kolon adidir
            length = 100, // db de ki kolon uzunlugu
            nullable = false, // bos gecilip gecilmeyecegi. false -> null gecilemez , true->null gecilebilir
            unique = false, // bensersiz olup olmayacagı. false -> bensersiz degil , true -> bensersiz
            updatable = true // güncellenebilir mi? true-> güncellenebilir , false -> güncellenemez
    )
    private String ad;

    // list veri kayıt etmek icin @elementcollection kullanılmalı
    @ElementCollection
    private List<String> telefonNo;

    @Embedded
    Iletisim iletisim;

    @Enumerated(EnumType.STRING)
    private Cinsiyet cinsiyet;
}
