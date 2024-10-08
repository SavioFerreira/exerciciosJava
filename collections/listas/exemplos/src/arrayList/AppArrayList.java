package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class AppArrayList {
    public static void main(String [] args) {
        System.out.println("Collection - List");

        ArrayList<String> nomes = new ArrayList<>(30);

        nomes.addAll(Arrays.asList(
                        "Savio", "Zoro", "Luffy", "Sanji", "Chopper",
                        "Usopp", "Franky", "Nami", "Robin", "Brook", "Jinbe"
                )
        );
        System.out.println("\n" + nomes);

        nomes.remove("Savio");
        System.out.println("\n\n" + nomes);
        nomes.remove(2);
        System.out.println("\n\n" + nomes);
        nomes.add("Pamonha frita");
        System.out.println("\n\n" + nomes);
        nomes.add(2, "Novo");
        System.out.println("\n\n" + nomes);
        nomes.set(2, "Trocou");
        System.out.println("\n\n" + nomes);
    }

}
