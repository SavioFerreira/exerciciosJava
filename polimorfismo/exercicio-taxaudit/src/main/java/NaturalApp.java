import entity.TaxManager;
import entity.person.pf.NaturalPerson;

public class NaturalApp {
    public static void main(String []args) {
        System.out.println("Tax Audit");
        var taxManager = new TaxManager();
        var marlon = new NaturalPerson("Marlon mendonça gonsalvea", 35_000);
        var eduard = new NaturalPerson("Eduard Newgates", 200_000);

        taxManager.add(marlon);
        taxManager.add(eduard);

    }
}
