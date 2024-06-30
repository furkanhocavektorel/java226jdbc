package org.vektorel.repository;

import org.vektorel.entity.Kitap;
import org.vektorel.utility.HDbConnection;

import java.util.ArrayList;
import java.util.List;

public class KitapRepository {
    HDbConnection hDbConnection;

    public KitapRepository() {
        this.hDbConnection = new HDbConnection();
    }

    //  CRUD
    // create, read, update, delete
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

    public void delete(Kitap kitap){
        try {
            hDbConnection.openSession();
            hDbConnection.session.delete(kitap);
            hDbConnection.commit();
        }catch (Exception e){
            hDbConnection.rollback();
        }

    }

    public Kitap findById(long id){
        try {
            hDbConnection.openSession();
            Kitap kitap=hDbConnection.session.find(Kitap.class,id);
            hDbConnection.commit();
            return kitap;
        }catch (Exception e){
            hDbConnection.rollback();
            return null;
        }
    }

    public List<Kitap> findAll(){

        // TODO query yazılacak
        // 3 adet query tipi var
        // 1_ native -> sql sorgusudur direkt
        // 2_ hql -> hibernate sorgusudur
        // 3_ named -> entity tepeisne yazılır
        List<Kitap> kitapList= new ArrayList<>();
        try {
            hDbConnection.openSession();
            kitapList=hDbConnection.session
                    .createNativeQuery("select * from kitap",Kitap.class).getResultList();
            hDbConnection.commit();
        }catch (Exception e){
            System.out.println("**********HATAAA**********");
            e.printStackTrace();
            hDbConnection.rollback();
        }
        return kitapList;
    }

}
