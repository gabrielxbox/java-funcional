package aula2;

public class FuncaoAltaOrdem {
    public static void main(String[] args) {
        Calculo SOMA = (a ,b) -> a+b;
        Calculo SUBRITACAO = (a,b) -> a-b;
        Calculo DIVICAO = (a,b) -> a/b;
        Calculo MULT = (a, b) -> a*b;

        System.out.println(executarOperacao(SOMA, 1, 3));//4
        System.out.println(executarOperacao(SUBRITACAO, 4, 3));//1
        System.out.println(executarOperacao(DIVICAO, 4, 2));//2
        System.out.println(executarOperacao(MULT, 7, 3));//21

    }


    public static int executarOperacao(Calculo calculo, int a ,int b){
        return calculo.calcular(a,b);
    }
// de forma antiga
    public int soma(int a, int b){
        return a + b;
    }
}

@FunctionalInterface
interface Calculo {
    public  int calcular(int a,int b);
}
// por parametro recebe outra funcao
// ou q ela retorna uma funcao