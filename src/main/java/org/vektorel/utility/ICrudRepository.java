package org.vektorel.utility;

// CREATE , UPDATE , DELETE , FINDBYID
public interface ICrudRepository<T,ID> {
    public void save(T t);
    public void update(T t);
    public void Delete(T t);
    public T findById(ID id);
}
