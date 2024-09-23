import static  enums.DrumStickBrands.*;

import model.DrumCymbalStock;
import model.DrumstickStock;
import model.ManageInventory;

public class App {
    public static void main(String[] args) {

       /*
       * Exercicio: criar uma interface com um método que
       * incremente a quantidade de itens quando um novo iten for adicionado.
       * Cada Classe que implementar a interface deve garantir que o método seja exclusivo
       * para não incrementar objetos de outras classes.
       */

        System.out.println("Exercicio com generics");

        var drumStickInventory = new ManageInventory();

        drumStickInventory.add(new DrumstickStock(LIVERPOOL, 2));
        drumStickInventory.add(new DrumstickStock(VATER, 3));
        drumStickInventory.add(new DrumstickStock(VIC_FIRTH, 4));
        printStock(drumStickInventory);

        var drumCymbalInventory = new ManageInventory();

        drumCymbalInventory.add(new DrumCymbalStock("Zeus ataque 16 pol", 2));
        drumCymbalInventory.add(new DrumCymbalStock("Zeus ataque 19 pol", 5));
        drumCymbalInventory.add(new DrumCymbalStock("Zeus conducao 22 pol", 1));
        printStock(drumCymbalInventory);

    }

    private static void printStock(ManageInventory inventory) {
        System.out.println("Stock " + inventory.getTotal());
    }
}



