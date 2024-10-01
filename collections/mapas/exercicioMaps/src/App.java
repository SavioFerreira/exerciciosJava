import java.util.*;

public class App {
    public static void main(String[] args) {

        System.out.println("Mapas");
        System.out.println();

        var avalur = new User("Avalur", 19);
        var cornelio = new User("Cornelio", 20);
        var tubaino = new User("Tubaino", 35);
        var mastodonte = new User("Mastodonte", 23);

        var attack = new Cymbal("Ataque Zeus 18", 600d);
        var conduction = new Cymbal("Conducao Zeus 22", 1600d);
        var chimbal = new Cymbal("Chimbal zeus 14", 800d);
        var splash = new Cymbal("Splash Zeus 12", 200d);

        System.out.println();
        System.out.println("Utilizando mapas com hashSet - tabela de espalhamento com maior desempenho,\n" +
                "mas a inclusao de itens e aleatoria");
        Map<Cymbal, User> itensHashMap = new HashMap<>();

        itensHashMap.put(attack, avalur);
        itensHashMap.put(conduction, cornelio);
        itensHashMap.put(chimbal, tubaino);
        itensHashMap.put(splash, mastodonte);

        for (Map.Entry<Cymbal, User> cymbalUserEntry : itensHashMap.entrySet()) {
            System.out.printf("Chave: %s, - Valor: %s", cymbalUserEntry.getKey(), cymbalUserEntry.getValue());
        }

        System.out.println();
        System.out.println("Utilizando mapas com LinkedHashMap - tabela de espalhamento com desempenho semelhante ao anterior,\n" +
                "mas a inclusao de itens respeita a ordem de inclusão e perde um pouco de desempenho");
        Map<Cymbal, User> itensLinkedHashMap = new LinkedHashMap<>();

        itensLinkedHashMap.put(attack, avalur);
        itensLinkedHashMap.put(conduction, cornelio);
        itensLinkedHashMap.put(chimbal, tubaino);
        itensLinkedHashMap.put(splash, mastodonte);

        for (Map.Entry<Cymbal, User> cymbalUserEntry : itensLinkedHashMap.entrySet()) {
            System.out.printf("Chave: %s, - Valor: %s", cymbalUserEntry.getKey(), cymbalUserEntry.getValue());
        }

        System.out.println();
        System.out.println("Utilizando mapas com TreeMap -  desempenho menor, pois não utilizada tabelas de espalhamento,\n" +
                "mas a inclusao de itens respeita a ordem natural( alfabetica)");
        Map<CymbalComparable, User> itensTreeMap = new TreeMap<>();

        var china = new CymbalComparable("China Zeus 19", 1200d);
        var stack = new CymbalComparable("Stack Zeus 14 15 16", 900d);
        var bell = new CymbalComparable("Bell Zeus 13", 1000d);

        itensTreeMap.put(china, avalur);
        itensTreeMap.put(stack, cornelio);
        itensTreeMap.put(bell, tubaino);

        for (Map.Entry<CymbalComparable, User> cymbalUserEntry : itensTreeMap.entrySet()) {
            System.out.printf("Chave: %s, - Valor: %s", cymbalUserEntry.getKey(), cymbalUserEntry.getValue());
        }

        System.out.println();
        System.out.println("Utilizando mapas com TreeMap com implementacao de Comparator para comparar com valores numéricos.\n" +
                " Desempenho menor, pois não utilizada tabelas de espalhamento," +
                "mas a inclusao de itens respeita a ordem natural( numerica)");
        Map<Cymbal, User> itensTreeMapPerPrice = new TreeMap<>(new CymbalPriceComparator());

        itensTreeMapPerPrice.put(attack, avalur);
        itensTreeMapPerPrice.put(conduction, cornelio);
        itensTreeMapPerPrice.put(chimbal, tubaino);
        itensTreeMapPerPrice.put(splash, mastodonte);

        for (Map.Entry<Cymbal, User> cymbalUserEntry : itensTreeMapPerPrice.entrySet()) {
            System.out.printf("Chave: %s, - Valor: %s", cymbalUserEntry.getKey(), cymbalUserEntry.getValue());
        }

    }
}
