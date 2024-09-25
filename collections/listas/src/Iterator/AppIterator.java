package Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class AppIterator {
    public static void main(String[] args) {
        System.out.println("Interator - ListIterator");
        System.out.println("Percorrendo item a item sem conhecer os detalhes!\n");

        ArrayList<String> nomes = new ArrayList<>(20);

        nomes.addAll(Arrays.asList(
                "Savio", "Zoro", "Luffy", "Sanji", "Chopper",
                "Usopp", "Franky", "Nami", "Robin", "Brook", "Jinbe")
        );

        ListIterator<String> nomesIterator = nomes.listIterator(nomes.size());
        int quantidade = 0;

        System.out.println(
                "O ListIterator, diferentemente do Iterator, possui um método que mermite iterar" +
                        " os itens da lista de trás para frente, com o método \"hasPrevious\" \n"
        );

        System.out.println(nomesIterator.previous());
        System.out.println(nomesIterator.previous());

        do {
            System.out.println(nomesIterator.previous());
            quantidade++;
        } while (nomesIterator.hasPrevious());
        System.out.printf("ele precisou percorrer %d  vezes%n", quantidade);
    }
}
