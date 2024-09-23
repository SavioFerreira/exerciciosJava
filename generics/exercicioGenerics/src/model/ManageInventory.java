package model;

public class ManageInventory {

    int total;

    public void add(Storable storable) {
        total += storable.getStockQuantity();
    }

    public int getTotal() {
        return total;
    }
}
