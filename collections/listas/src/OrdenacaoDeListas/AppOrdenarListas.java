package OrdenacaoDeListas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AppOrdenarListas {
    public static void main(String[] args) {
        System.out.println("Ordenando listas");
        List<Integer> numeros = new ArrayList<>(Arrays.asList(6,4,3,4,5,2, 9, 1,12));
        List<DrumCymbalStock> pratos = new ArrayList<>(Arrays.asList(
                new DrumCymbalStock("teste", 2),
                new DrumCymbalStock("teste5", 4),
                new DrumCymbalStock("teste1", 5),
                new DrumCymbalStock("teste4", 3)
        ));

        System.out.println("\nOrdem original");
        System.out.println(numeros + " ");
        System.out.println(pratos + " ");

        System.out.println("\nOrdem natural");
        numeros.sort(Comparator.naturalOrder());
        pratos.sort(Comparator.naturalOrder());
        System.out.println(numeros + " ");
        System.out.println(pratos + " ");

        System.out.println("\nOrdem reversa");
        numeros.sort(Comparator.reverseOrder());
        pratos.sort(Comparator.reverseOrder());
        System.out.println(numeros + " ");
        System.out.println(pratos + " ");
    }
}
