import comparacaoGenerics.SorteadorSemGenerics;
import domain.Geladinha;
import domain.Picole;

public class AppSemGenerics {
    public static void main(String[] args) {
        System.out.println("Sem generics");

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

        Picole picoleSelecionado = (Picole) SorteadorSemGenerics.sortear(picoles);
        Geladinha geladinhaSelecionada = (Geladinha) SorteadorSemGenerics.sortear(geladinhas);


        System.out.println(picoleSelecionado.mostrar(picoleSelecionado.getSabor()));
        System.out.println(geladinhaSelecionada.mostrar(geladinhaSelecionada.getSabor()));
        System.out.println("\nNota fiscal");
        System.out.println(picoleSelecionado);
        System.out.println(geladinhaSelecionada);

    }
}
