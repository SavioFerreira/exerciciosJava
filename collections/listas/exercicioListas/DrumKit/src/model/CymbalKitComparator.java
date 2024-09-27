package model;

import java.util.Comparator;

public class CymbalKitComparator implements Comparator<CymbalKit> {

    @Override
    public int compare(CymbalKit o1, CymbalKit o2) {
        return Double.compare(o1.getPricePerCymbal(), o2.getPricePerCymbal());
    }
}
