
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



        do {

            System.out.println("""
                    *********************************************************
                    Sea bienvenido/a al Conversor de Moneda =]
                    
                    1) Dólar =>> Peso argentino
                    2) Peso argentino =>> Dólar
                    3) Dólar =>> Peso chileno
                    4) Peso chileno =>> Dólar
                    5) Dólar =>> Peso colombiano
                    6) Peso colombiano =>> Dólar
                    7) Salir
                    Elige una opción válida:
                    *********************************************************
                    """);

            int opciones = scanner.nextInt();

            double cantidadMoneda;
            double cantidadResultado;

            switch (opciones){
                case 1:
                    Estructuras.mensajeInicial();
                    cantidadMoneda = scanner.nextDouble();
                    cantidadResultado = Estructuras.divisaAMoneda(cantidadMoneda,monedaARS);
                    Estructuras.mensajeFinal(cantidadMoneda, cantidadResultado,"USD", "ARG");
                    break;
                case 2:
                    Estructuras.mensajeInicial();
                    cantidadMoneda = scanner.nextDouble();
                    cantidadResultado = Estructuras.conversionADivisa(cantidadMoneda , monedaARS);
                    Estructuras.mensajeFinal(cantidadMoneda, cantidadResultado,"ARG", "USD");
                    break;
                case 3:
                    Estructuras.mensajeInicial();
                    cantidadMoneda = scanner.nextDouble();
                    cantidadResultado = Estructuras.divisaAMoneda(cantidadMoneda,monedaCLP );
                    Estructuras.mensajeFinal(cantidadMoneda, cantidadResultado,"USD", "CLP");
                    break;
                case 4:
                    Estructuras.mensajeInicial();
                    cantidadMoneda = scanner.nextDouble();
                    cantidadResultado = Estructuras.conversionADivisa(cantidadMoneda, monedaCLP);
                    Estructuras.mensajeFinal(cantidadMoneda, cantidadResultado,"CLP", "USD");
                    break;
                case 5:
                    Estructuras.mensajeInicial();
                    cantidadMoneda = scanner.nextDouble();
                    cantidadResultado = Estructuras.divisaAMoneda(cantidadMoneda, monedaCOP);
                    Estructuras.mensajeFinal(cantidadMoneda,cantidadResultado, "USD", "COP");
                    break;
                case 6:
                    Estructuras.mensajeInicial();
                    cantidadMoneda = scanner.nextDouble();
                    cantidadResultado = Estructuras.conversionADivisa(cantidadMoneda, monedaCOP);
                    Estructuras.mensajeFinal(cantidadMoneda, cantidadResultado, "COP", "USD");
                    break;
                case 7:
                    break;
            }





        }

    }
}
