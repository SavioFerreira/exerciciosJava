import domain.Picole;
import domain.Produto;
import domain.Geladinha;
import domain.Sorteador;

public class App {
    public static void main(String[] args) {
        System.out.println("Lidando com generics");

        Produto[] picoles = {
                (new Picole("Chocolate", "grande", 7)),
                (new Picole("leite-condensado", "pequeno", 9.50)),
                (new Picole("morango", "medio", 5))
        };

        Produto[] geladinhas = {
                (new Geladinha("Avelã", "medio", 4)),
                (new Geladinha("morango", "pequeno", 5.25)),
                (new Geladinha("caramelo", "pequeno", 8))
        };

        Produto picoleSelecionado = Sorteador.sortear(picoles);
        Produto geladinhaSelecionada = Sorteador.sortear(geladinhas);

        boolean isPicole = picoleSelecionado.getClass().getName().equals(Picole.class.getName());
        boolean isGeladinha = geladinhaSelecionada.getClass().getName().equals(Geladinha.class.getName());

        if (isPicole && isGeladinha) {
            System.out.println(picoleSelecionado.mostrar(((Picole) picoleSelecionado).getSabor()));
            System.out.println(geladinhaSelecionada.mostrar(((Geladinha) geladinhaSelecionada).getSabor()));
            System.out.println("\nNota fiscal");
            System.out.println(picoleSelecionado);
            System.out.println(geladinhaSelecionada);
        }
    }
}
