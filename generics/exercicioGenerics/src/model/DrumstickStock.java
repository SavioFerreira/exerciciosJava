package model;

import enums.DrumStickBrands;

public class DrumstickStock implements Storable {

    DrumStickBrands brand;
    int quantity;
    int stockTotal;

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
        return "Drumsticks{" +
                ", brand=" + brand +
                '}';
    }
}
