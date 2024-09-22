package domain;

import java.util.Objects;

public class Picole implements Produto {
    String sabor;
    double preco;
    String tamanho;


    public Picole(String sabor, String tamanho) {
        this.sabor = sabor;
        this.tamanho = tamanho;
    }

    public Picole(String sabor, String tamanho, double preco) {
        this.sabor = sabor;
        this.preco = preco;
        this.tamanho = tamanho;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "sabor='" + sabor + '\'' +
                ", preco=" + preco +
                ", tamanho='" + tamanho + '\'' +
                '}';
    }

    @Override
    public String mostrar(String nome) {
        Objects.requireNonNull(nome, "O nome de ver informado");
        return "\nOlá.\nO sabor de " + getClass().getSimpleName() +
                " escolhido foi \"" + nome.toUpperCase() +  "\", aproveite!";
    }
}
