import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Locale;

public class App {
    public static void main(String[] args) {
        System.out.println("Big decimal");

        Locale.setDefault(Locale.of("pt", "BR"));

        BigDecimal numero = new BigDecimal("3500032");
        BigDecimal numero2 = new BigDecimal("23.2");
        BigDecimal resultado = numero.subtract(numero2);
        DecimalFormat format = new DecimalFormat("¤#,###.###;¤#.##");
        System.out.println(format.format(resultado));
    }
}
