package org.vektorel.repository;

import org.vektorel.entity.Kitap;
import org.vektorel.utility.HDbConnection;

public class KitapRepository {
    HDbConnection hDbConnection;

    public KitapRepository() {
        this.hDbConnection = new HDbConnection();
    }

    public void save(Kitap kitap){
        try {
            hDbConnection.openSession();
            hDbConnection.session.save(kitap);
            hDbConnection.commit();
        }catch (Exception e){
            System.out.println("***********HATAAA**************");
            e.printStackTrace();
            hDbConnection.rollback();
        }
    }

}
