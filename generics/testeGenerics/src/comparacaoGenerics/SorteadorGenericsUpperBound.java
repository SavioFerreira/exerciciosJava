package comparacaoGenerics;

import domain.Produto;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class SorteadorGenericsUpperBound {

    static final Random RANDOM = new Random();

    public static <T extends Produto> T sortear(T[] item) {
        Objects.requireNonNull(item,"a lista de itens deve ser informada");
        int posicao = RANDOM.nextInt(item.length);
        return item[posicao];
    }
}
