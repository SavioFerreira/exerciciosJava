import static  enums.DrumStickBrands.*;

import model.DrumCymbalStock;
import model.DrumstickStock;
import model.ManageInventory;
import model.Storable;

public class App {
    public static void main(String[] args) {

       /*
       * Exercicio: criar uma interface com um método que
       * incremente a quantidade de itens quando um novo iten for adicionado.
       * Cada Classe que implementar a interface deve garantir que o método seja exclusivo
       * para não incrementar objetos de outras classes.
       */

        System.out.println("Exercicio com generics");

        var drumStickInventory = new ManageInventory<DrumstickStock>();

        drumStickInventory.add(new DrumstickStock(LIVERPOOL, 2));
        drumStickInventory.add(new DrumstickStock(VATER, 3));
        drumStickInventory.add(new DrumstickStock(VIC_FIRTH, 4));
        printStock(drumStickInventory);

        var drumCymbalInventory = new ManageInventory<DrumCymbalStock>();

        drumCymbalInventory.add(new DrumCymbalStock("Zeus ataque 16 pol", 2));
        drumCymbalInventory.add(new DrumCymbalStock("Zeus ataque 19 pol", 5));
        drumCymbalInventory.add(new DrumCymbalStock("Zeus conducao 22 pol", 1));

        // Não compila, visto que o tipo DrumStickStock não é um cymbal
        // Esse erro ocorre pois a classe ManagerInventory aceita classes que extendem Storable
        // Mas somente a classe instanciada primeiro, pode ser utilizada.
        drumCymbalInventory.add(new DrumstickStock(VIC_FIRTH, 4));
        printStock(drumCymbalInventory);

    }

    private static void printStock(ManageInventory<?> inventory) {
        System.out.println("Stock " + inventory.getTotal());
    }
}



