package lk.ijse.gdse.dao.dao;

import org.hibernate.Session;

import java.util.List;

public interface SuperDAO <T,ID>{
    public void setSession(Session session) throws Exception;

    public boolean save(T t)throws Exception;

    public void update(T t)throws Exception;

    public void delete(T t)throws Exception;

    public T findById(ID id) throws Exception;

    public List<T> getAll()throws Exception;
}
