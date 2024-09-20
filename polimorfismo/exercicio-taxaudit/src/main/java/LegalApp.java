import entity.TaxManager;
import entity.person.pf.NaturalPerson;
import entity.person.pj.RealCompanyProfit;
import entity.person.pj.SimpleCompany;

public class LegalApp {
    public static void main(String []args) {
        System.out.println("Tax Audit");
        var taxManager = new TaxManager();

        var marlon = new NaturalPerson("Marlon mendonça gonsalvea", 35_000);
        var eduard = new NaturalPerson("Eduard Newgates", 200_000);

        var portegas = new RealCompanyProfit("Portegas D. Ace", 4_000_000, 700_000);
        var valur = new SimpleCompany("Valur D. Valíria", 500_000, 130_000);

        taxManager.add(portegas);
        taxManager.add(valur);

        taxManager.add(marlon);
        taxManager.add(eduard);

    }
}
