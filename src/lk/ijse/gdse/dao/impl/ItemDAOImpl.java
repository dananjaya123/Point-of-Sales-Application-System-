package lk.ijse.gdse.dao.impl;

import lk.ijse.gdse.dao.custom.ItemDAO;
import lk.ijse.gdse.entity.Item;
import org.hibernate.Session;

import java.util.List;

public class ItemDAOImpl implements ItemDAO {
    protected Session session;

    public ItemDAOImpl() {
    }

    @Override
    public void setSession(Session session) throws Exception {


    }

    @Override
    public boolean save(Item item) throws Exception {
        return false;
    }

    @Override
    public void update(Item item) throws Exception {

    }

    @Override
    public void delete(Item item) throws Exception {

    }

    @Override
    public Item findById(Integer integer) throws Exception {
        return null;
    }

    @Override
    public List<Item> getAll() throws Exception {
        return null;
    }
}
