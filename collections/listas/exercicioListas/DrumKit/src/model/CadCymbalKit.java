package model;

import java.util.*;

public class CadCymbalKit {

    List<CymbalKit> cymbalKits = new ArrayList<>();

    public void add(String decription, double cymbalPrice) {
        CymbalKit kit = new CymbalKit(decription, cymbalPrice);
        if (cymbalKits.contains(kit)) {
            throw new IllegalArgumentException("Esse kit já está listado");
        }
        cymbalKits.add(kit);
    }

    public List<CymbalKit> getAll() {
        return cymbalKits;
    }

    public void order() {
        Collections.sort(cymbalKits);
    }

    public void orderPerPriceDecreasing() {
        cymbalKits.sort(new CymbalKitComparator().reversed());
    }

    public void removePerDescription(String description) {
        boolean removed = false;
        Iterator<CymbalKit> kitIterator = cymbalKits.iterator();

        while (kitIterator.hasNext()) {
            CymbalKit kit  = kitIterator.next();
            if(kit.getDescription().equals(description)){
                kitIterator.remove();
                System.out.println("funfou");
                removed = true;
            }
        }
        if (!removed) {
            throw new KitDescriptionNonFoundException("Nenhum item com a descrição informada foi encontrado!");
        }
    }

    private String verifyLengthDescription(String description) {
        int MAX_LENGTH_DESCRIPTION = 40;
        if(description.length() > MAX_LENGTH_DESCRIPTION) {
            return String.format("\"%s...\"", description.substring(0, MAX_LENGTH_DESCRIPTION));
        }
        return String.format("\"%s\"", description);
    }

    public CymbalKit searchPerDescription(String description) {
        for (CymbalKit cymbalKit : cymbalKits) {
            if (cymbalKit.getDescription().equals(description)){
                return cymbalKit;
            }
        }
        throw new KitDescriptionNonFoundException(
                String.format("O item com a descrição: [%s] não foi encontrado", verifyLengthDescription(description)));
    }

}