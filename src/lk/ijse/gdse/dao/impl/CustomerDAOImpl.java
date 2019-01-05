package lk.ijse.gdse.dao.impl;

import lk.ijse.gdse.dao.custom.CustomerDAO;
import lk.ijse.gdse.entity.Customer;
import org.hibernate.Session;

import java.util.List;

public class CustomerDAOImpl implements CustomerDAO {
    @Override
    public void setSession(Session session) throws Exception {

    }

    @Override
    public boolean save(Customer customer) throws Exception {
        return false;
    }

    @Override
    public void update(Customer customer) throws Exception {

    }

    @Override
    public void delete(Customer customer) throws Exception {

    }

    @Override
    public Customer findById(Integer integer) throws Exception {
        return null;
    }

    @Override
    public List<Customer> getAll() throws Exception {
        return null;
    }
}
