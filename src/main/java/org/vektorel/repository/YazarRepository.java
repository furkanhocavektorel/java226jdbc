package org.vektorel.repository;

import org.vektorel.entity.Yazar;
import org.vektorel.utility.CrudRepository;

public class YazarRepository extends CrudRepository<Yazar,Long> {
    public YazarRepository() {
        super(Yazar.class);
    }
}
