package domain;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class Sorteador {

    static final Random RANDOM = new Random();

    public static Produto sortear(Produto[] produto) {
        Objects.requireNonNull(produto,"a lista de produtos deve ser informada");
        int posicao = RANDOM.nextInt(produto.length);
        return produto[posicao];
    }
}
