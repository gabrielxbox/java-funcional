package aula2;

import java.util.function.Consumer;

public class Consumidores {
    public static void main(String[] args) {
        // method Reference

       // -apenas
       //- utilizar o parametro da forma que ele foi recebido

        Consumer<String> imprimirUmaFrase = System.out::println;

        //lanbida
       // Consumer<String> imprimirUmaFrase = frase -> System.out.println(frase);
        imprimirUmaFrase.accept("Hello World");
    }
}
