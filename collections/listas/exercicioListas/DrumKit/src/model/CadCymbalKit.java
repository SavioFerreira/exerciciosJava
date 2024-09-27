package model;

import java.util.*;

public class CadCymbalKit {

    // TODO declarar lista de kits de pratos

    public void add(String decription, double cymbalPrice) {
        // TODO adicionar kit na lista, validando antes se
        //  já existe usando contains (lançar exceção)
    }

    public List<CymbalKit> getAll() {
        // TODO retornar lista de kits
        return null;
    }

    public void order() {
        // TODO ordenar kits pela ordem natural
    }

    public void orderPerPriceDecreasing() {
        // TODO ordenar kits pelo preço (decrescente)
    }

    public void removePerDescription(String description) {
        // TODO iterar nos kits com Iterator e remover aqueles com descrição informada,
        //  lançando exceção se nenhum kit foi removido
    }

    public CymbalKit searchPerDescription(String description) {
        // TODO iterar kits com enhanced for, localizar e retornar
        //  kit com descrição informada (ou lançar exceção se não encontrar)
        return null;
    }

}