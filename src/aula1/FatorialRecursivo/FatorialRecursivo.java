package aula1.FatorialRecursivo;

public class FatorialRecursivo {
    public static void main(String[] args) {
        System.out.println(fatorial(5));
    }
    // funão de ewcusividade no else
    public  static int fatorial (int value) {
        if (value == 1){
            return value;
        } else {

        return value * fatorial((value - 1));
        }
    }

    // 5
    //5* 4* 3* 2 * 1
    // 120
}
