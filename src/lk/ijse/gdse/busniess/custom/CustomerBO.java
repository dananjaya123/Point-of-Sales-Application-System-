package lk.ijse.gdse.busniess.custom;

import lk.ijse.gdse.busniess.bo.SuperBO;
import lk.ijse.gdse.dto.CustomerDTO;

import java.util.ArrayList;

public interface CustomerBO extends SuperBO {
    public boolean addCustomer(CustomerDTO customerDTO)throws Exception;
    public boolean deleteCustomer(int id)throws Exception;
    public ArrayList<CustomerDTO>getAllCustomer()throws Exception;
    public CustomerDTO searchCustomer(int id)throws Exception;
    public boolean updateCustomer(CustomerDTO customerDTO)throws Exception;

}
