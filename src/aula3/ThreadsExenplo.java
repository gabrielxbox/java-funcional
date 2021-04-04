package aula3;

public class ThreadsExenplo {
    public static void main(String[] args) {

        GeradorPDF geradorPDF = new GeradorPDF();
        BarraDoCarreGamento barraDoCarreGamento = new BarraDoCarreGamento(geradorPDF);

        barraDoCarreGamento.start();
        geradorPDF.start();

       /* Thread thread = new Thread(new BarraDoCarreGamento2());
        Thread thread1 = new Thread(new BarraDoCarreGamento3());

        thread.start();
        thread1.start();

        System.out.println("Nome da thread: " + thread.getName());
        System.out.println("Nome da thread: " + thread1.getName());*/

       /* uma forma de fazer
       BarraDoCarreGamento4 BarraDoCarreGamento4 = new BarraDoCarreGamento4();
        BarraDoCarreGamento4.run();*/


    }

}


class  GeradorPDF extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("Iniciar geraçao de PDF");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("PDF Gerado");
    }


}

class BarraDoCarreGamento extends   Thread {

    private Thread iniciarGerarPDF;

    public BarraDoCarreGamento(Thread iniciarGerarPDF) {
        this.iniciarGerarPDF = iniciarGerarPDF;
    }

    @Override
    public void run() {

        Integer total  = 10;

        while (true){

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (!iniciarGerarPDF.isAlive()){
                 break;
            }
            System.out.println("Loading......." +"%"+ total);
            total = total + 10;
        }

    }
}

// um exenplo de como fazer
 class BarraDoCarreGamento2  implements  Runnable {
     @Override
     public void run() {                        // nome da thred

         try {
             Thread.sleep(1000);
             System.out.println("roda  BarraDoCarreGamento2 :" );
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
}


// um exenplo de como fazer
class BarraDoCarreGamento3  implements  Runnable {
    @Override
    public void run() {                        // nome da thred

        try {
            Thread.sleep(5000);
            System.out.println("roda  BarraDoCarreGamento3 :" );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// um exenplo de como fazer
class BarraDoCarreGamento4 extends  Thread {
    @Override
    public void run() {                        // nome da thred

        try {
            Thread.sleep(10000);
            System.out.println("roda BarraDoCarreGamento3 :" + this.getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


/// exenplo de barra de carregamento em relatorio com Threads