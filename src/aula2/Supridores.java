package aula2;

import java.util.function.Supplier;

public class Supridores {
    public static void main(String[] args) {
        Supplier<Pessoa> instanciaPessoa = () -> new Pessoa();

        System.out.println(instanciaPessoa.get());
    }
}



class Pessoa {
    private String nome;
    private Integer idade;

    public Pessoa() {
        this.nome = "Gabriel";
        this.idade = 29;
    }

    @Override
    public String toString(){
        return String.format("nome : %s, idade: %d",nome,idade);
    }
}