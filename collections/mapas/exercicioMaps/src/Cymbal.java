import java.util.Objects;

public class Cymbal {

    private String description;
    private double pricePerCymbal;

    public Cymbal(String description, double pricePerCymbal) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cymbal cymbal = (Cymbal) o;
        return Objects.equals(description, cymbal.description);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(description);
    }

    @Override
    public String toString() {
        return "Drum Cymbals{" +
                "description='" + description + '\'' +
                ", pricePerCymbal=" + pricePerCymbal +
                '}';
    }

}