package model;

public class ManageInventory<T extends Storable> {

    int total;

    public void add(T storable) {
        total += storable.getStockQuantity();
    }

    public int getTotal() {
        return total;
    }
}
