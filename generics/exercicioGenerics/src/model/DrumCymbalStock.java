package model;

public class DrumCymbalStock  implements Storable {
    String model;
    int quantity;

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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int getStockQuantity() {
        return getQuantity();
    }

    @Override
    public String toString() {
        return "model.DrumCymbals{" +
                "model='" + model + '\'' +
                '}';
    }
}
