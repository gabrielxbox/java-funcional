package aula2;

import java.util.function.Predicate;

public class Predicados {
    public static void main(String[] args) {
        Predicate<String> estaVazio =  valor -> valor.isEmpty();
        // metodo referencia
        Predicate<String> estaVazio1 =  String::isEmpty;
        System.out.println(estaVazio1.test(""));


        System.out.println(estaVazio.test(""));
        System.out.println(estaVazio.test("Gabriel"));
    }
}
