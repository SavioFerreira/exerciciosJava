package comparacaoGenerics;

import domain.Produto;

import java.util.Objects;
import java.util.Random;

public class SorteadorComGenerics {

    static final Random RANDOM = new Random();

    public static <T> T sortear(T[] obj) {
        Objects.requireNonNull(obj,"a lista de itens deve ser informada");
        int posicao = RANDOM.nextInt(obj.length);
        return obj[posicao];
    }
}
