package lk.ijse.gdse.dao.dao;

import lk.ijse.gdse.dao.impl.CustomerDAOImpl;
import lk.ijse.gdse.dao.impl.ItemDAOImpl;

public class DAOFactory {

    private static DAOFactory daoFactory;
    public static enum DaoTypes{
        ITEM,CUSTOMER
    }
    public DAOFactory(){

    }
    public static DAOFactory getInstance(){
        if (daoFactory==null){
            daoFactory=new DAOFactory();
        }
        return daoFactory;
    }
    public SuperDAO getDao(DaoTypes types){
        switch (types){
            case CUSTOMER:
                return new CustomerDAOImpl();
            case ITEM:
                return new ItemDAOImpl();

                default:
                    return null;
        }
    }
}
