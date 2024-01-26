package challange;

import java.util.Random;

// 3  (Sentenças aleatórias) Elabore um aplicativo que utiliza geração de números aleatórios para criar frases. Utilize quatro arrays de strings
//  chamados article, noun, verb e preposition. Crie uma frase selecionando uma palavra aleatoriamente de cada array na seguinte
//  ordem: article, noun, verb, preposition, article e noun. À medida que cada palavra é selecionada, concatene-a às primeiras
//  palavras na frase. As palavras devem ser separadas por espaços. Quando a frase final for enviada para saída, ela deve iniciar com uma letra
//  maiúscula e terminar com um ponto. O aplicativo deve gerar e exibir 20 frases.
//  O array de artigos deve conter os artigos "the", "a", "one", "some" e "any"; o array de substantivos deve conter os substantivos
//  "boy", "girl", "dog", "town" e "car"; o array de verbos deve conter os verbos "drove", "jumped", "ran", "walked" e
//  "skipped"; o array de preposições deve conter as preposições "to", "from", "over", "under" e "on".



public class GerandoFrasesAleatoriasComArrays{

    public static Integer gerarNumeroAleatorio(){

        int value =  new Random().nextInt(4); 
        return  value;
    }

    public static String pegarPalavra(String[] opcoes){

        return opcoes[gerarNumeroAleatorio()];
    }

// Esse método quebra quando mudo a posição que quero deixar em maiúsculo (char)

    public static String minusculaParaMaiuscula (String palavra, int posicao){
        int max = palavra.length() -1;
        if (posicao <= max) {
            Character firstChar = palavra.charAt(posicao);
            String firstCharToUpper = firstChar.toString().toUpperCase();
            palavra =  palavra.replace(firstChar, firstCharToUpper.charAt(posicao));
            return palavra;
        } 
        else return palavra;
    }

    public static String gerarFrase(){

        String [] article = {"the", "a", "one", "some", "any"};
        String [] noum = {"boy", "girl", "dog", "town", "car"};
        String [] verb = {"drove", "jumped", "ran", "walked", "skipped"};
        String [] preposition = {"to", "from", "over", "under", "on"};

        // article, noun, verb, preposition, article e noun
        
        String primeiraPalavra = article[gerarNumeroAleatorio()];
        primeiraPalavra = minusculaParaMaiuscula(primeiraPalavra, 0);


        String fraseMontada = (
            primeiraPalavra.concat(" ").concat(noum[gerarNumeroAleatorio()]).concat(" ").
            concat(verb[gerarNumeroAleatorio()]).concat(" ").concat(preposition[gerarNumeroAleatorio()]).concat(" ").
            concat(article[gerarNumeroAleatorio()]).concat(" ").concat(noum[gerarNumeroAleatorio()]).concat(".")
        );

        return fraseMontada;
    }

    public static void mostrarFrases(String... frases){
        for (int i=0; i < 20; i++ ) {
            System.out.println(gerarFrase() + "\n");
        }
        
    }


    public static void main(String[] args) {

        System.out.println("\t\tCriando palavras aleatórias\n");
        mostrarFrases(gerarFrase());
        
    }
}


