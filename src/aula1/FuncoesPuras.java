package aula1;

import java.util.function.BiPredicate;

public class FuncoesPuras {

    public static void main(String[] args) {
        BiPredicate<Integer, Integer>verifivarSeEMaoir = (parametro, valorComparacao) -> parametro > valorComparacao;

        System.out.println(verifivarSeEMaoir.test(13 , 12));
        System.out.println(verifivarSeEMaoir.test(13,12));
    }

}
