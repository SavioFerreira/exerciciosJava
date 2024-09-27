package model;

import java.util.Objects;

public class CymbalKit implements Comparable<CymbalKit>{

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
    public int compareTo(CymbalKit o) {
        return getDescription().compareTo(o.getDescription());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CymbalKit cymbalKit = (CymbalKit) o;
        return Objects.equals(description, cymbalKit.description);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(description);
    }

    @Override
    public String toString() {
        return "DrumKit Cymbals{" +
                "description='" + description + '\'' +
                ", pricePerCymbal=" + pricePerCymbal +
                '}';
    }

}