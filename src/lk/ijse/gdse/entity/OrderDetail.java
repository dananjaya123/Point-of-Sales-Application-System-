package lk.ijse.gdse.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
public class OrderDetail implements Serializable {

    private int orderQTY;
    private double totale;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @Id
    private Item item;


    @ManyToOne(cascade = CascadeType.PERSIST)
    @Id
    private Orders orders;


    public OrderDetail() {
    }

    public OrderDetail(int orderQTY, double totale, Item item, Orders orders) {
        this.orderQTY = orderQTY;
        this.totale = totale;
        this.item = item;
        this.orders = orders;
    }

    public int getOrderQTY() {
        return orderQTY;
    }

    public void setOrderQTY(int orderQTY) {
        this.orderQTY = orderQTY;
    }

    public double getTotale() {
        return totale;
    }

    public void setTotale(double totale) {
        this.totale = totale;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "orderQTY=" + orderQTY +
                ", totale=" + totale +
                ", item=" + item +
                ", orders=" + orders +
                '}';
    }
}
