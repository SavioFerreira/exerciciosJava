import comparacaoGenerics.SorteadorComGenerics;
import comparacaoGenerics.SorteadorGenericsUpperBound;
import domain.Geladinha;
import domain.Picole;

public class AppGenericsUpperBound {
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

        String[] testeUpperBound = {
                "Teste", "Generics", "upperBound"
        };

        Picole picoleSelecionado = SorteadorGenericsUpperBound.<Picole>sortear(picoles);
        Geladinha geladinhaSelecionada = SorteadorGenericsUpperBound.<Geladinha>sortear(geladinhas);

        // Não compila, visto que o o generics foi limitado para aceitar de qualquer tipo que extenda da
        // interface Produto. String não está estendendo Produto...
        String teste = SorteadorGenericsUpperBound.sortear(testeUpperBound);

        System.out.println(picoleSelecionado.mostrar(picoleSelecionado.getSabor()));
        System.out.println(geladinhaSelecionada.mostrar(geladinhaSelecionada.getSabor()));
        System.out.println("\nNota fiscal");
        System.out.println(picoleSelecionado);
        System.out.println(geladinhaSelecionada);
    }
}
