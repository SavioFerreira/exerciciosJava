package Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class AppListIterator {
    public static void main(String[] args) {
        System.out.println("Interator");
        System.out.println("Percorrendo item a item sem conhecer os detalhes!\n");

        ArrayList<String> nomes = new ArrayList<>(20);

        nomes.addAll(Arrays.asList(
                        "Savio", "Zoro", "Luffy", "Sanji", "Chopper",
                        "Usopp", "Franky", "Nami", "Robin", "Brook", "Jinbe")
        );

        Iterator<String> nomesIterator = nomes.iterator();
        int quantidade = 0;

        System.out.println(
                "Como ele itera duas vezes antes de entrar no while, " +
                "ele não repete os itens, mesmo eles estando fora do loop\n"
        );

        System.out.println(nomesIterator.next());
        System.out.println(nomesIterator.next());

        do {
            System.out.println(nomesIterator.next());
            quantidade++;
        } while (nomesIterator.hasNext());
        System.out.printf("ele precisou percorrer %d  vezes%n", quantidade);
    }
}
