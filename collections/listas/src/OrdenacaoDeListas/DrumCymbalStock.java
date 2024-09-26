package OrdenacaoDeListas;

import java.util.Objects;

public class DrumCymbalStock implements Comparable<DrumCymbalStock> {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DrumCymbalStock that = (DrumCymbalStock) o;
        return Objects.equals(model, that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(model);
    }

    @Override
    public String toString() {
        return "DrumCymbals{" +
                "model='" + model + '\'' +
                '}';
    }

    @Override
    public int compareTo(DrumCymbalStock o) {
        return model.compareTo(o.getModel());
    }
}
