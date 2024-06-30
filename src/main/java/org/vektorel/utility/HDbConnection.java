package org.vektorel.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HDbConnection {
    public Session session=null;
    Transaction transaction=null;

    public void openSession(){
        SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
        session= sessionFactory.openSession();
        transaction=session.beginTransaction();
    }

    public void commit(){
        transaction.commit();
        session.close();
    }

    public void rollback(){
        transaction.rollback();
        session.close();
    }



}
