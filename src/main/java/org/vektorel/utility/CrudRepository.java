package org.vektorel.utility;

public class CrudRepository<T,ID> implements ICrudRepository<T,ID>{

    HDbConnection hDbConnection;
    Class<T> clazz;
    public CrudRepository(Class<T> clazz) {
        this.clazz=clazz;
        this.hDbConnection = new HDbConnection();
    }

    @Override
    public void save(T t) {

        try {
            hDbConnection.openSession();
            hDbConnection.session.save(t);
            hDbConnection.commit();
        }catch (Exception e){
            hDbConnection.rollback();
        }

    }

    @Override
    public void update(T t) {

        try {
            hDbConnection.openSession();
            hDbConnection.session.update(t);
            hDbConnection.commit();
        } catch (Exception e){
            hDbConnection.rollback();
        }

    }

    @Override
    public void Delete(T t) {

        try {
            hDbConnection.openSession();
            hDbConnection.session.delete(t);
            hDbConnection.commit();
        }catch (Exception e){
            hDbConnection.rollback();
        }
    }

    @Override
    public T findById(ID id) {

        try {
            hDbConnection.openSession();
            T t= hDbConnection.session.get(clazz,id);
            hDbConnection.commit();
            return t;
        }catch (Exception e){
            e.printStackTrace();
            hDbConnection.rollback();
            return null;
        }

    }
}
