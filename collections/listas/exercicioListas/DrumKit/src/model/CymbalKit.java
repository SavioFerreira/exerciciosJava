package model;

import java.util.Objects;

public class CymbalKit {

    private String description;
    private double pricePerCymbal;

    public CymbalKit(String description, double pricePerCymbal) {
        Objects.requireNonNull(description);

        if (pricePerCymbal < 0) {
            throw new IllegalArgumentException("Preço por prato não pode ser negativo");
        }

        this.description = description;
        this.pricePerCymbal = pricePerCymbal;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPricePerCymbal() {
        return pricePerCymbal;
    }

    public void setPricePerCymbal(double pricePerCymbal) {
        this.pricePerCymbal = pricePerCymbal;
    }

    @Override
    public String toString() {
        return "DrumKit Cymbals{" +
                "description='" + description + '\'' +
                ", pricePerCymbal=" + pricePerCymbal +
                '}';
    }

    // TODO implementar equals e hashCode

    // TODO implementar compareTo

}