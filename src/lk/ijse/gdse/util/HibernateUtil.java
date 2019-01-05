package lk.ijse.gdse.util;

import lk.ijse.gdse.entity.Customer;
import lk.ijse.gdse.entity.Item;
import lk.ijse.gdse.entity.OrderDetail;
import lk.ijse.gdse.entity.Orders;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
    public static SessionFactory sessionFactory=buildSessionFactory();
    private static SessionFactory buildSessionFactory(){
        StandardServiceRegistry registry=new StandardServiceRegistryBuilder().loadProperties("Applications.properties").build();
        Metadata metadata = new MetadataSources(registry)

                .addAnnotatedClass(Customer.class).addAnnotatedClass(Item.class).addAnnotatedClass(Orders.class).addAnnotatedClass(OrderDetail.class)

                .buildMetadata();

        return metadata.getSessionFactoryBuilder().build();
        }
        public static SessionFactory getSessionFactory(){return sessionFactory;}


}