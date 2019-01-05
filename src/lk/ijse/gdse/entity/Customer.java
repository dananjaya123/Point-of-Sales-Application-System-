package lk.ijse.gdse.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer {
    @Id
    private int CustID;
    private String name;
    private String address;
    @OneToMany(mappedBy = "customer",cascade = CascadeType.PERSIST)
    private List<Orders>orders=new ArrayList<>();

    public Customer() {
    }

    public Customer(int custID, String name, String address) {
        CustID = custID;
        this.name = name;
        this.address = address;
    }

    public Customer(int custID, String name, String address, List<Orders> orders) {
        CustID = custID;
        this.name = name;
        this.address = address;
        this.orders = orders;
    }

    public int getCustID() {
        return CustID;
    }

    public void setCustID(int custID) {
        CustID = custID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "CustID=" + CustID +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", orders=" + orders +
                '}';
    }
}
