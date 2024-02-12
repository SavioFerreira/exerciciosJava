package challange;

import java.util.Scanner;

public class ComparandoComCompareTo {

    // (Comparando Strings) Elabore um aplicativo que utiliza o método String
    // compareTo para comparar duas entradas de strings pelo
    // usuário. Crie uma saída informando se a primeira string é menor que, igual a
    // ou maior que a segunda.

    public static void main(String args[]) {

        Scanner scan  = new Scanner(System.in);
        System.out.println("Entre com as duas palavras que serão comparadas. ");
        String e1 = scan.nextLine();
        String e2 = scan.nextLine();
        boolean ehIgual = (e1.compareToIgnoreCase(e2) == 0);
        boolean ehIMenor = (e1.compareToIgnoreCase(e2) < 0 );
        boolean ehMaior= (e1.compareToIgnoreCase(e2) > 0);

        if (ehIgual){
            System.out.printf("\nAs duas palavras são iguais: %s - %s\n", e1, e2);
        } else if (ehIMenor){
            System.out.printf("\nA palavra s: %s é menor que a palavra: %s\n", e1, e2);
        } else if (ehMaior){
            System.out.printf("\nA palavra s: %s é maior que a palavra: %s\n", e1, e2);
        } else System.out.println("valor incompatível");
        System.out.println(e1.compareTo(e2));
        scan.close();
    }
}