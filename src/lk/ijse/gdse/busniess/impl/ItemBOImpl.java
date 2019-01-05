package lk.ijse.gdse.busniess.impl;

import lk.ijse.gdse.busniess.custom.ItemBO;
import lk.ijse.gdse.dao.custom.ItemDAO;
import lk.ijse.gdse.dao.dao.DAOFactory;
import lk.ijse.gdse.dto.ItemDTO;
import lk.ijse.gdse.entity.Item;
import lk.ijse.gdse.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;

import java.util.ArrayList;

public class ItemBOImpl implements ItemBO {

    private ItemDAO itemDAO;
    public ItemBOImpl(){
        itemDAO=(ItemDAO) DAOFactory.getInstance().getInstance().getDao(DAOFactory.DaoTypes.ITEM);
    }
    @Override
    public boolean addItem(ItemDTO itemDTO) throws Exception {
       try (Session session= HibernateUtil.getSessionFactory().openSession()){
           itemDAO.setSession(session);
           session.beginTransaction();

           Item item=new Item(itemDTO.getItemCode(),itemDTO.getItemName(),itemDTO.getQty(),itemDTO.getUnitPrice());

           itemDAO.save(item);
           session.getTransaction().commit();
           session.close();
       }
       return true;
    }

    @Override
    public boolean deleteItem(int id) throws Exception {
        return false;
    }

    @Override
    public ArrayList<ItemDTO> getAllItem() throws Exception {
        return null;
    }

    @Override
    public ItemDTO searchItem(int id) throws Exception {
        return null;
    }

    @Override
    public boolean updateItem(ItemDTO itemDTO) throws Exception {
        return false;
    }
}
