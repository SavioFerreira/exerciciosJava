import java.util.*;

public class App {
    public static void main(String[] args) {
        System.out.println("Conjuntos(Set) hashSet - TreeSet - LinkedHashSet\n");

        Set<DrumstickStock> baquetasHashSet = new HashSet<>(
                Arrays.asList(
                        new DrumstickStock(DrumStickBrands.PRO_MARK, 3),
                        new DrumstickStock(DrumStickBrands.VATER, 4),
                        new DrumstickStock(DrumStickBrands.VIC_FIRTH, 2),
                        new DrumstickStock(DrumStickBrands.LIVERPOOL, 6),
                        new DrumstickStock(DrumStickBrands.ZILDJIAN, 7)
                ));

        Set<DrumstickStock> baquetasLinkedHashSet = new LinkedHashSet<>(
                Arrays.asList(
                        new DrumstickStock(DrumStickBrands.PRO_MARK, 3),
                        new DrumstickStock(DrumStickBrands.VATER, 4),
                        new DrumstickStock(DrumStickBrands.VIC_FIRTH, 2),
                        new DrumstickStock(DrumStickBrands.LIVERPOOL, 6),
                        new DrumstickStock(DrumStickBrands.ZILDJIAN, 7)
                ));

        Set<DrumstickStock> baquetasTreeSet = new TreeSet<>(
                Arrays.asList(
                        new DrumstickStock(DrumStickBrands.PRO_MARK, 3),
                        new DrumstickStock(DrumStickBrands.VATER, 4),
                        new DrumstickStock(DrumStickBrands.VIC_FIRTH, 2),
                        new DrumstickStock(DrumStickBrands.LIVERPOOL, 6),
                        new DrumstickStock(DrumStickBrands.ZILDJIAN, 7)
                ));

        Set<DrumstickStock> baquetasTreeSet_quantityOrder = new TreeSet<>(new DrumStickBrandsComparator());
        baquetasTreeSet_quantityOrder.addAll(
                Arrays.asList(
                        new DrumstickStock(DrumStickBrands.PRO_MARK, 3),
                        new DrumstickStock(DrumStickBrands.VATER, 4),
                        new DrumstickStock(DrumStickBrands.VIC_FIRTH, 2),
                        new DrumstickStock(DrumStickBrands.LIVERPOOL, 6),
                        new DrumstickStock(DrumStickBrands.ZILDJIAN, 7)));


        System.out.println("Mais performance - Inclui aleatoriamente");
        System.out.println(baquetasHashSet);
        System.out.println("--");

        System.out.println("Performance um pouco menor - Inclui na ordem de inclusao");
        System.out.println(baquetasLinkedHashSet);
        System.out.println("--");

        System.out.println("Menor performance, Inclui na ordem natural (alfabetica)");
        System.out.println(baquetasTreeSet);
        System.out.println("--");

        System.out.println("Menor performance, Inclui na ordem natural (numerica)");
        System.out.println(baquetasTreeSet_quantityOrder);
        System.out.println("--");

    }

}
