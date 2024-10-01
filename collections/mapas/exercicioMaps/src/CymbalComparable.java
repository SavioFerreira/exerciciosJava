import java.util.Objects;

public class CymbalComparable implements Comparable<CymbalComparable>{

    private String description;
    private double pricePerCymbal;

    public CymbalComparable(String description, double pricePerCymbal) {
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
    public int compareTo(CymbalComparable o) {
        return getDescription().compareTo(o.getDescription());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CymbalComparable cymbalKit = (CymbalComparable) o;
        return Objects.equals(description, cymbalKit.description);
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