package model;

public class Service {

    public String nameItem;

    public int quantity;

    public double bill;

    public double billOut;

    public int conditionkhach;

    public int conditionkho;
    
    public Service(String nameItem, int conditionkhach, int quantity, double bill, int conditionkho) {
        this(nameItem, conditionkhach, quantity, bill, conditionkho, 0.0);
    }

    public Service(String nameItem, int conditionkhach, int quantity, double bill, int conditionkho, double billOut) {
        this.nameItem = nameItem;
        this.quantity = quantity;
        this.bill = bill;
        setBillOut(billOut);
        this.conditionkho = conditionkho;
        this.conditionkhach = conditionkhach;

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
