
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

        Estructuras prueba = new Estructuras();
        double seleccionValorMoneda = prueba.seleccionValorMoneda;
        String seleccionNombreMoneda = prueba.seleccionNombreMoneda;

        int opciones;
        double cantidadMoneda;
        double cantidadResultado;







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

            opciones = scanner.nextInt();



            if (opciones == 1 || opciones == 2){
                seleccionValorMoneda = monedaARS;
                seleccionNombreMoneda = "ARG";
            } else if (opciones == 3 || opciones == 4) {
                seleccionValorMoneda = monedaCLP;
                seleccionNombreMoneda = "CLP";
            }else if (opciones == 5 || opciones == 6) {
                seleccionValorMoneda = monedaCOP;
                seleccionNombreMoneda = "COP";
            }


            if (opciones == 3 || opciones == 5 ){
                opciones = 1;
            } else if (opciones == 4 || opciones == 6) {
                opciones = 2;
            }

            switch (opciones){
                case 1:

                    Estructuras.mensajeInicial();
                    cantidadMoneda = scanner.nextDouble();
                    cantidadResultado = Estructuras.divisaAMoneda(cantidadMoneda,seleccionValorMoneda);
                    Estructuras.mensajeFinal(cantidadMoneda, cantidadResultado,"USD", seleccionNombreMoneda);
                    break;
                case 2:
                    Estructuras.mensajeInicial();
                    cantidadMoneda = scanner.nextDouble();
                    cantidadResultado = Estructuras.conversionADivisa(cantidadMoneda , seleccionValorMoneda);
                    Estructuras.mensajeFinal(cantidadMoneda, cantidadResultado,seleccionNombreMoneda, "USD");
                    break;
                case 7:
                    break;
                default:
                    System.out.println("""
               ****************************************************
               Seleccione una opción válida.
               ****************************************************
                """);
            }

        } while (opciones != 7);
        System.out.println("""
                ****************************************************
                ****************************************************
                
                Gracias por usar nuestros servicios!
                
                ****************************************************
                ****************************************************
                """);

    }
}
