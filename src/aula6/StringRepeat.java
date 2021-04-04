package aula6;

public class StringRepeat {
    public static void main(String[] args) {
        String nome = "Gabriel ";
        String aux = "";

/// da forma antida
        for (int i = 0; i < 10; i++) {
            aux+="," + nome;
        }

        System.out.println(aux);

        System.out.println("-------- atual java 11 -----------------");

        System.out.println(nome .repeat(10));
    }
}
