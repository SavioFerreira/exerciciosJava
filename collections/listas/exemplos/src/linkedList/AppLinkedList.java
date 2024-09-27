package linkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class AppLinkedList {
    public static void main(String [] args) {
        System.out.println("Lidando com LinkedList");

        LinkedList<String> nomes = new LinkedList<>(Arrays.asList(
                "Savio", "Zoro", "Luffy", "Sanji", "Chopper",
                "Usopp", "Franky", "Nami", "Robin", "Brook", "Jinbe"
        ));

        System.out.println("LinkedList tem poucos métodos exclusivos." +
                " \"addLast\" e \"addFirst\" são me similares ao \"add\" e add com parametro.");

        System.out.println("\n\n" + nomes);
        nomes.addFirst("Pamonha frita");
        System.out.println("\n\n" + nomes);
        nomes.addLast("Novo");
        System.out.println("\n\n" + nomes);
        nomes.removeFirst();
        System.out.println("\n\n" + nomes);
    }
}
