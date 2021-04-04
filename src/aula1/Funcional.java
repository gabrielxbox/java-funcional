package aula1;

import java.util.function.UnaryOperator;

public class Funcional {

    public static void main(String[] args) {
        UnaryOperator<Integer> cauculaValorVezesTrinta = valor  -> valor*3; // um conseito do paradigima funcional
        int valor = 10;
        System.err.print("o resultado " + cauculaValorVezesTrinta.apply(10));
    }
}
