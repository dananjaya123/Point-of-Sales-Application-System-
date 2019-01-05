package lk.ijse.gdse.busniess.impl;

import lk.ijse.gdse.busniess.custom.CustomerBO;
import lk.ijse.gdse.dto.CustomerDTO;

import java.util.ArrayList;

public class CustomerBOImpl implements CustomerBO {
    @Override
    public boolean addCustomer(CustomerDTO customerDTO) throws Exception {
        return false;
    }

    @Override
    public boolean deleteCustomer(int id) throws Exception {
        return false;
    }

    @Override
    public ArrayList<CustomerDTO> getAllCustomer() throws Exception {
        return null;
    }

    @Override
    public CustomerDTO searchCustomer(int id) throws Exception {
        return null;
    }

    @Override
    public boolean updateCustomer(CustomerDTO customerDTO) throws Exception {
        return false;
    }
}
