package lk.ijse.gdse.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import lk.ijse.gdse.busniess.bo.BOFactory;
import lk.ijse.gdse.busniess.custom.ItemBO;
import lk.ijse.gdse.dto.ItemDTO;

import java.net.URL;
import java.util.ResourceBundle;

public class ItemController implements Initializable {

    @FXML
    private TableView<?> tblItem;

    @FXML
    private JFXButton btnAdd;

    @FXML
    private TextField textItemCode;

    @FXML
    private TextField textItemName;

    @FXML
    private TextField textItemQty;

    @FXML
    private TextField textItemUnitPrice;

    @FXML
    private JFXButton btnDelete;

    @FXML
    private JFXButton btnUpdate;

    @FXML
    private TextField textItemSearch;

    @FXML
    private JFXButton btnSearch;


private ItemBO itemBO;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    itemBO=(ItemBO) BOFactory.getInstance().getBO(BOFactory.BOTyps.ITEM);

    }
    @FXML
    void btnAddOnAction(ActionEvent event) throws Exception {
        int code=Integer.parseInt(textItemCode.getText());
        String name=textItemName.getText();
        int qty=Integer.parseInt(textItemQty.getText());
        double unitPrice=Double.parseDouble(textItemUnitPrice.getText());

        ItemDTO itemDTO= new ItemDTO(code,name,unitPrice,qty);
        boolean add=itemBO.addItem(itemDTO);

        if (add){
            Alert alert=new Alert(Alert.AlertType.INFORMATION,"Item Add");
            alert.showAndWait();
        }else {
            Alert alert=new Alert(Alert.AlertType.INFORMATION,"Not add");
        }
    }

    @FXML
    void btnDeleteOnAction(ActionEvent event) {

    }

    @FXML
    void btnSearchOnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {

    }


}
