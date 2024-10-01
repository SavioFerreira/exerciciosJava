import java.util.Comparator;

public class DrumStickBrandsComparator implements Comparator<DrumstickStock> {

    @Override
    public int compare(DrumstickStock o1, DrumstickStock o2) {
        return Integer.compare(o1.getQuantity(), o2.getQuantity());
    }
}
