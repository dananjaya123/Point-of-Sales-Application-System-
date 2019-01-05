package lk.ijse.gdse.dto;

public class CustomerDTO {
    private int CustID;
    private String name;
    private String address;

    public CustomerDTO() {
    }

    public CustomerDTO(int custID, String name, String address) {
        CustID = custID;
        this.name = name;
        this.address = address;
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

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "CustID=" + CustID +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
