import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Exercicio com BigDecimal\n");
        Scanner sc = new Scanner(System.in);
        BigDecimal valorEntrada = BigDecimal.ZERO;
        BigDecimal dolar = BigDecimal.ZERO;


        System.out.print("Quantos dólares você vai conveter? ");
        valorEntrada = sc.nextBigDecimal();
        System.out.print("Qual o valor do dolar atualmente? ");
        dolar = sc.nextBigDecimal();
        System.out.println(formatar(converterDolarParaReal(valorEntrada, dolar)));

    }

    public static BigDecimal converterDolarParaReal(BigDecimal realValue, BigDecimal dolarValue) {
        return realValue.multiply(dolarValue);
    }

    public static String formatar(BigDecimal value){
        return new DecimalFormat("¤#,###,###;¤#.###").format(value);
    }

    public static BigDecimal padraoMonetarioReal() {
        //TODO  fazer a lógica para receber o valor em dolar e retornar com padrão br
        return null;
    }

    public static BigDecimal padraoMonetarioDolar() {
        //TODO  fazer a lógica para receber o valor em real e retornar com padrão americano
        return null;
    }
}
