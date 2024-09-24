package model;

import enums.DrumStickBrands;

public class DrumstickStock implements Storable {

    DrumStickBrands brand;
    int quantity;

    public DrumstickStock(DrumStickBrands brand, int quantity) {
        this.brand = brand;
        this.quantity = quantity;
    }

    public DrumStickBrands getBrand() {
        return brand;
    }

    public void setBrand(DrumStickBrands brand) {
        this.brand = brand;
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
        return "Drumsticks{" +
                ", brand=" + brand +
                '}';
    }
}
