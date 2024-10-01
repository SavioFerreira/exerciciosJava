import java.util.Objects;
import java.util.Set;

public class DrumstickStock implements Comparable<DrumstickStock> {

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
    public String toString() {
        return "Drumsticks{" +
                " brand=" + brand +
                " quantity=" + quantity +
                "}\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DrumstickStock that = (DrumstickStock) o;
        return brand == that.brand;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(brand);
    }

    @Override
    public int compareTo(DrumstickStock o) {
         String item = getBrand().toString();
         return item.compareTo(o.getBrand().toString());
    }
}
