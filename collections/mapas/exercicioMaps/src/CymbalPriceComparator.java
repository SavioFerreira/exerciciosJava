import java.util.Comparator;
import java.util.Objects;

public class CymbalPriceComparator implements Comparator<Cymbal> {
    @Override
    public int compare(Cymbal o1, Cymbal o2) {
        return Double.compare(o1.getPricePerCymbal(), o2.getPricePerCymbal());
    }
}