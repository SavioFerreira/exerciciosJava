import model.CadCymbalKit;
import model.CymbalKit;

import java.util.List;

public class App {

    public static void main(String[] args) {
        var cad = new CadCymbalKit();
        cad.add("kit c pratos zeus custom _ liga b20 (conducao 20, ataque 16, par chimbal 14)", 3_000);
        cad.add("kit e pratos zeus custom _ liga b20 (conducao 20, ataque 16, ataque 18, par chimbal 14, splash 10)", 4_500);
        cad.add("kit pratos Zildjian (conducao 22, ataque 18, par chimbal 14, china 18, stack 16)", 12_000);
        cad.add("kit sabian (conducao 20, ataque 17, ataque 19, par chimbal 15)", 7_500);
        cad.add("teste", 2_000);

        cad.removePerDescription("teste");
        printKits(cad.getAll());
        System.out.println();
        cad.orderPerPriceDecreasing();
        printKits(cad.getAll());
        System.out.println();
        cad.order();
        printKits(cad.getAll());
        System.out.println();
        CymbalKit kitFound = cad.searchPerDescription("Meu nome é monkey D. Luffy e eu vou ser o rei dos piratas.");
        System.out.println(kitFound);
    }

    private static void printKits(List<CymbalKit> kits) {
        for (CymbalKit kit : kits) {
            System.out.println(kit);
        }
    }

}