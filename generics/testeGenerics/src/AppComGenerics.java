import comparacaoGenerics.SorteadorComGenerics;
import domain.Geladinha;
import domain.Picole;

public class AppComGenerics {
    public static void main(String[] args) {
        System.out.println("com generics");

        Picole[] picoles = {
                (new Picole("Chocolate", "grande", 7)),
                (new Picole("leite-condensado", "pequeno", 9.50)),
                (new Picole("morango", "medio", 5))
        };

        Geladinha[] geladinhas = {
                (new Geladinha("Avelã", "medio", 4)),
                (new Geladinha("morango", "pequeno", 5.25)),
                (new Geladinha("caramelo", "pequeno", 8))
        };

        Picole picoleSelecionado =SorteadorComGenerics.<Picole>sortear(picoles);
        Geladinha geladinhaSelecionada = SorteadorComGenerics.<Geladinha>sortear(geladinhas);

        System.out.println(picoleSelecionado.mostrar(picoleSelecionado.getSabor()));
        System.out.println(geladinhaSelecionada.mostrar(geladinhaSelecionada.getSabor()));
        System.out.println("\nNota fiscal");
        System.out.println(picoleSelecionado);
        System.out.println(geladinhaSelecionada);
    }
}
