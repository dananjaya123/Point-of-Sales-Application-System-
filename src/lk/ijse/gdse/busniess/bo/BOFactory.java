package lk.ijse.gdse.busniess.bo;

import lk.ijse.gdse.busniess.impl.CustomerBOImpl;
import lk.ijse.gdse.busniess.impl.ItemBOImpl;

public class BOFactory {
    private static BOFactory boFactory;

    public enum BOTyps{
        ITEM,CUSTOMER
    }
    public BOFactory(){

    }
    public static BOFactory getInstance(){
        if (boFactory==null){
            boFactory=new BOFactory();
        }
        return boFactory;
    }
    public SuperBO getBO(BOTyps typs){
        switch (typs){
            case ITEM:
                return new ItemBOImpl();
            case CUSTOMER:
                return new CustomerBOImpl();
            default:
                return null;
        }
    }
}
