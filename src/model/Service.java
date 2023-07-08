package model;

public class Service {

    public int idItem;
    public String nameItem;

    public int quantity;

    public double bill;

    public double billOut;

    public int conditionkhach;

    public int conditionkho;

    public Service() {
    }

    public Service(int idItem) {
        this.idItem = idItem;
    }

    public Service(String nameItem, int conditionkhach, int quantity, double bill, int conditionkho) {
        this(conditionkhach, nameItem,  quantity, bill, conditionkho, 0.0);
    }

    public Service( int conditionkhach, String nameItem,  int quantity, double bill, int conditionkho, double billOut) {
        this.nameItem = nameItem;
        this.quantity = quantity;
        this.bill = bill;
        setBillOut(billOut);
        this.conditionkho = conditionkho;
        this.conditionkhach = conditionkhach;

    }

    public Service(int idItem, int conditionkhach, String nameItem, int quantity, double bill, int conditionkho, double billOut) {
        this.idItem = idItem;
        this.nameItem = nameItem;
        this.quantity = quantity;
        this.bill = bill;
        this.billOut = billOut;
        this.conditionkhach = conditionkhach;
        this.conditionkho = conditionkho;
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public String getNameItem() {
        return nameItem;
    }

    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

    public int getConditionkhach() {
        return conditionkhach;
    }

    public void setConditionkhach(int conditionkhach) {
        this.conditionkhach = conditionkhach;
    }

    public int getConditionkho() {
        return conditionkho;
    }

    public void setConditionkho(int conditionkho) {
        this.conditionkho = conditionkho;
    }

    public double getBillOut() {
        return billOut;
    }

    public void setBillOut(double billOut) {
        if (!Double.isNaN(billOut)) {
            this.billOut = billOut;
        }
    }
}
