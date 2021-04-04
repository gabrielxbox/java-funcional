package aula2;

import java.text.Collator;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracao {
    public static void main(String[] args) {
        String[] nomes = {"Gabriel","Paulo","Oliveira", "Santos","Instrutor", "Java" };
        Integer[] numero = {1,2,3,4,5};
        //imprimirNomesFiltrados(nomes);
        //imprimirTodosNomes(nomes);
        imprimirODobroDeCadaIteracaoDaLista(numero);

        List<String> listaDeProficao = new ArrayList<>();
        listaDeProficao.add("Desenvolvedor");
        listaDeProficao.add("Testador");
        listaDeProficao.add("Gerente de projeto");
        listaDeProficao.add("Gerente de calidade");

        listaDeProficao.stream()
        .filter(proficao -> proficao.startsWith("Gerente"))
        .forEach(System.out::println);
    }


    public static void imprimirNomesFiltrados(String... nomes){
      // formas de fazer 1
         String nomesParaImprimir="";
        for(int i = 0; i < nomes.length; i++){
            if(nomes[i].equals("Gabriel")){
                nomesParaImprimir +=""+nomes[i];
            }
        }
        System.out.println("Nomes do for :" + nomesParaImprimir);

        // formas de fazer 2
       String nomesParaImprimirStream =  Stream.of(nomes)
                .filter(nome -> nome.equals("Gabriel"))
                .collect((Collectors.joining())); // String

        System.out.println("Nomes do stream: " + nomesParaImprimirStream);
    }

    public static void imprimirTodosNomes(String... nomes){
        for (String nome  : nomes){
            System.out.println("Imprimindo pelo for: " + nome);
        }
        // outra forma
        Stream.of(nomes)
                .forEach(nome -> System.out.println("imprimindo pelo Stream : " + nome));

    }

    public static void imprimirODobroDeCadaIteracaoDaLista(Integer... numeros){
        for (Integer numero: numeros){
            System.out.println("Imprimindo pelo for: " + numero*2);
        }

        // outra forma
        Stream.of(numeros)
                .map(nome ->  nome* 2)
                .forEach(System.out::println);

    }

}
