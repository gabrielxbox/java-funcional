package aula2;

import java.util.function.Function;

public class Funcoes {
    public static void main(String[] args) {
        Function<String,String> retornaNomeAoContrario = texto -> new StringBuffer(texto).reverse().toString();
        System.out.println(retornaNomeAoContrario.apply("Gabriel"));
        // retornando um inteiro
        Function<String,Integer> converterStringParaIteiroECalcularODobror = string ->Integer.valueOf(string) * 2;

        System.out.println(converterStringParaIteiroECalcularODobror.apply("20"));
    }
}
