package challange;

import java.util.Scanner;

public class ComparandoComRegionMatches {


// (Comparando partes de Strings) Elabore um aplicativo que utiliza o método String regionMatches para comparar duas entradas de strings pelo usuário. 
// O aplicativo deve inserir o número de caracteres que será comparado e o índice inicial da comparação. O
// aplicativo deve declarar se as strings são iguais. Ignore a distinção entre maiúsculas e minúsculas dos caracteres ao realizar a comparação

    public static void main(String[] args) {
     Scanner scan  = new Scanner(System.in);
        System.out.println("Entre com as duas palavras que serão comparadas. ");
        String e1 = scan.nextLine();
        String e2 = scan.nextLine();
        System.out.println("Qual a posicao inicial da primeira palavra, inicial da segunda palavra e comprimento do trecho a ser comparado? ");
        Integer inicialPalavra1 = scan.nextInt();
        Integer inicialPalavra2 = scan.nextInt();
        Integer valueToCompare = scan.nextInt();
        Boolean compare = e1.regionMatches(false, inicialPalavra1, e2, inicialPalavra2, valueToCompare);
        if(compare){
            System.out.println("Os trechos comparados são iguais ");
        } else System.out.println("Trecho não é o mesmo");
        scan.close();
    }

}