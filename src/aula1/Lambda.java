package aula1;

public class Lambda {

    public static void main(String[] args) {
        Funcao1 funcao1 = valor -> {
            System.out.println(valor);
            return  valor;
        };

        System.out.println(funcao1.gerar("Gabriel"));
   }

}


interface Funcao1{

    String gerar(String valor);
}
