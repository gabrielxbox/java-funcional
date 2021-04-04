package aula5;

import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.stream.Collectors;

public class InferenciaExenplo {

    public static void main(String[] args)  throws IOException {

        printarSoma(5,5,5);

    }

    private static void connectAndPrintUrlJavaOlx() throws IOException {

        //utilizado no java 10 var nao consegue ser utilizado a nivel de class
        var  url = new URL("https://ba.olx.com.br/grande-salvador/autos-e-pecas/carros-vans-e-utilitarios/fiesta-1-6-titanium-automatico-2017-836258482");

        var urlConnection = url.openConnection();


        try {
            var bufferedReader = new  BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">", ">\n" ));

        } catch (Exception e){

        }

    }


    public static  void testar(String nome, String sobreNome){
        // var nao pode ser  utilizado como parametro

        var nomeCompleto= String.format("%s %s",nome,sobreNome);

        System.out.println(nomeCompleto);
    }

    public static  void printarSoma(int ...numeros){
        int soma;

        if (numeros.length > 0) {
            soma = 0;
            for (var numero : numeros) {
                soma += numero;
            }
            for (var numero = 0; numero < numeros.length; numero++) {
                soma +=numeros[numero];
            }

        System.out.println("A soma é ::  " + soma);
        }

    }

    // consegue

    // verificar local inicializadas
    // verificar suporte de for
    // verificar suporte no for interativo
    // pode ter dento do try

    // nao cnsegue

    // vat nao posse ser utilizado em nivel de class
    // var nao pode ser utilizado como variavel
    // não consegue iniciar em variavel local

}

