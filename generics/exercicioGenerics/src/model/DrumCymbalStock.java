package model;

public class DrumCymbalStock  implements Storable {
    String model;
    int quantity;
    int stockTotal;


    public DrumCymbalStock(String model, int quantity) {
        this.model = model;
        this.quantity = quantity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getStockTotal() {
        return stockTotal;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setStockTotal(int stockTotal) {
        this.stockTotal = stockTotal;
    }

    @Override
    public int getStockQuantity() {
        return getStockTotal();
    }

    @Override
    public String toString() {
        return "model.DrumCymbals{" +
                "model='" + model + '\'' +
                '}';
    }
}
