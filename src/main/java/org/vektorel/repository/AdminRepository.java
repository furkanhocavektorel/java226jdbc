package org.vektorel.repository;

import org.vektorel.entity.Admin;
import org.vektorel.utility.HDbConnection;

public class AdminRepository {
    HDbConnection dbConnection;

    public AdminRepository() {
        this.dbConnection = new HDbConnection();
    }

    public void save(Admin admin){
        try {
            dbConnection.openSession();
            dbConnection.session.save(admin);
            dbConnection.commit();
        }catch (Exception e){
            dbConnection.rollback();
        }
    }

}
