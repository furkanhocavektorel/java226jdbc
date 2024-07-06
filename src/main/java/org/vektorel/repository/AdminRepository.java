package org.vektorel.repository;

import org.vektorel.entity.Admin;
import org.vektorel.utility.CrudRepository;
import org.vektorel.utility.HDbConnection;

public class AdminRepository extends CrudRepository<Admin,Long> {
    public AdminRepository() {
        super(Admin.class);
    }




 /*   HDbConnection dbConnection;

    public AdminRepository() {
        this.dbConnection = new HDbConnection();
    }

    // ESKİ YAZIM -> EXTEND ALMADAN ONCE
    // save , update, findByıd, delete
    public void save(Admin admin){
        try {
            dbConnection.openSession();
            dbConnection.session.save(admin);
            dbConnection.commit();
        }catch (Exception e){
            dbConnection.rollback();
        }
    }
    public void update(Admin admin){
        try {
            dbConnection.openSession();
            dbConnection.session.update(admin);
            dbConnection.commit();
        }catch (Exception e){
            dbConnection.rollback();
        }
    }

    public Admin findById(long id){
        Admin admin=null;
        try {
            dbConnection.openSession();;
            admin=dbConnection.session.find(Admin.class,id);
            dbConnection.commit();
        }catch (Exception e){
            dbConnection.rollback();
        }
        return admin;

    }

    public void delete(Admin admin){
        try {
            dbConnection.openSession();
            dbConnection.session.delete(admin);
            dbConnection.commit();
        }catch (Exception e){
            dbConnection.rollback();
        }
    }*/

}
