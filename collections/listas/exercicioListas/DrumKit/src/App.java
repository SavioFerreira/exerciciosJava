import model.CadCymbalKit;
import model.CymbalKit;

import java.util.List;

public class App {

    public static void main(String[] args) {
        var cad = new CadCymbalKit();
        cad.add("Istambul e Capadócia (20 noites)", 18_000);
        cad.add("Neve em Bariloche (10 noites)", 11_000);
        cad.add("Disney (10 noites)", 20_000);
        cad.add("Natal Luz em Gramado (5 noites)", 8_500);

        //--
        cad.removePerDescription("Disney (7 noites)");

        cad.order();
        cad.orderPerPriceDecreasing();

        CymbalKit kitFound = cad.searchPerDescription("Disney (7 noites)");
        System.out.println(kitFound);
        //--
        printKits(cad.getAll());
    }

    private static void printKits(List<CymbalKit> kits) {
        // TODO iterar nos kits e imprimir descrição e preço
    }

}