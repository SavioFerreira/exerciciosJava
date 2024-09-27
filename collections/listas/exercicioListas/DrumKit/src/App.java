import model.CadCymbalKit;
import model.CymbalKit;

import java.util.List;

public class App {

    public static void main(String[] args) {
        var cad = new CadCymbalKit();
        cad.add("kit C pratos zeus custom _ liga b20 (conducao 20, ataque 16, par chimbal 14)", 3_000);
        cad.add("kit E pratos zeus custom _ liga b20 (conducao 20, ataque 16, ataque 18, par chimbal 14, splash 10)", 4_500);
        cad.add("kit pratos Zildjian (conducao 22, ataque 18, par chimbal 14, china 18, stack 16)", 12_000);
        cad.add("kit Sabian (conducao 20, ataque 17, ataque 19, par chimbal 15)", 7_500);

/*
        cad.removePerDescription("kit pratos Paiste (stack 17, chimbal 15)");
        cad.order();
        cad.orderPerPriceDecreasing();

        CymbalKit kitFound = cad.searchPerDescription("kit pratos Paiste (stack 17, chimbal 15)");
        System.out.println(kitFound);
*/

        printKits(cad.getAll());
    }

    private static void printKits(List<CymbalKit> kits) {
        for (CymbalKit kit : kits) {
            System.out.println(kit);
        }
    }

}