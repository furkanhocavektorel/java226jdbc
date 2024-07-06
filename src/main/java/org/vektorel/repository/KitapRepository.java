package org.vektorel.repository;

import org.vektorel.entity.Kitap;
import org.vektorel.utility.HDbConnection;

import java.util.ArrayList;
import java.util.List;

public class KitapRepository {
    HDbConnection hDbConnection;

    // TODO query yazılacak
    // 3 adet query tipi var
    // 1_ native -> sql sorgusudur direkt +
    // 2_ hql -> hibernate sorgusudur
    // 3_ named -> entity tepeisne yazılır

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

    public void update(Kitap kitap){
        try {
            hDbConnection.openSession();
            hDbConnection.session.update(kitap);
            hDbConnection.commit();
        }catch (Exception e){
            hDbConnection.rollback();
        }
    }

    // sql sorgusu
    public List<Kitap> findByNameNativeQuery(String kitapAdi){
        List<Kitap> kitapList=new ArrayList<>();
        try {
            hDbConnection.openSession();
            // select * from kitap where name = 'Hobbit'
            kitapList= hDbConnection.session.
           createNativeQuery("select * from kitap where name = '"+kitapAdi+"'", Kitap.class).list();
            hDbConnection.commit();
        }catch (Exception e){
            hDbConnection.rollback();
        }
        return kitapList;
    }

    public List<Kitap> findByNameHqlQuery(String  kitapAdi){
        List<Kitap> kitapList=new ArrayList<>();
        try {
            hDbConnection.openSession();

            // 1.yazim
            /*kitapList= hDbConnection.session.
                    createQuery("from Kitap where ad='"+kitapAdi+"'").list();*/
            //2.yazim
            kitapList= hDbConnection.session.
                    createQuery("from Kitap where ad= :kitabinAdi")
                    .setParameter("kitabinAdi",kitapAdi).list();

            hDbConnection.commit();

        }catch (Exception e){

            hDbConnection.rollback();
        }
        return kitapList;
    }




}
