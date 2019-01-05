package lk.ijse.gdse.busniess.custom;

import lk.ijse.gdse.busniess.bo.SuperBO;
import lk.ijse.gdse.dto.ItemDTO;

import java.util.ArrayList;

public interface ItemBO extends SuperBO {
    public boolean addItem(ItemDTO itemDTO)throws Exception;
    public boolean deleteItem(int id)throws Exception;
    public ArrayList<ItemDTO> getAllItem()throws Exception;
    public ItemDTO searchItem(int id)throws Exception;
    public boolean updateItem(ItemDTO itemDTO)throws Exception;

}
