
import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {



        Scanner scanner = new Scanner(System.in);

        SolicitudDeDatosAPI moneda = new SolicitudDeDatosAPI();
        double monedaARS = moneda.monedaARS;
        double monedaBOB = moneda.monedaBOB;
        double monedaBRL = moneda.monedaBRL;
        double monedaCOP = moneda.monedaCOP;
        double monedaCLP = moneda.monedaCLP;
        double monedaUSD = moneda.monedaUSD;



//        System.out.println("Por favor ingresa tu moneda principal");
//        String monedaUno = scanner.nextLine().toUpperCase();
//        System.out.println("por favor ingresa tu moneda a convertir");
//         String monedaDos = scanner.nextLine().toUpperCase();
//        System.out.println("Por favor ingresa el monto que deseas convertir");
//        int monto = scanner.nextInt();

//        Serialized respuesta = new Serialized();


        System.out.println("5 USD es igual a: " + monedaCLP * 5 + "$ CLP");

        System.out.println(Estructuras.divisaAMoneda(5, monedaCLP));

        System.out.println("5000$ CLP es igual a: " + 5000 / monedaCLP + "$ Dólares" );

        System.out.println(Estructuras.conversionADivisa(5000, monedaCLP));



    }
}
