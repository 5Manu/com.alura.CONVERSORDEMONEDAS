

public class Estructuras {



    public double seleccionValorMoneda;
    String seleccionNombreMoneda;

    public static double conversionADivisa(double cantidad, double moneda){
       return cantidad / moneda;}

    public static double divisaAMoneda(double cantidad,double moneda){
        return cantidad * moneda;
    }




    public static void mensajeInicial(){
        System.out.println("Ingrese el valor que deseas convertir:");
    }

    public static void mensajeFinal(Double cantidadMoneda,Double cantidadResultado,  String monedaInicial, String monedaFinal){
        System.out.println("El valor: " +cantidadMoneda+ "["+monedaInicial+"]" + "corresponde al valor final de =>>> " +cantidadResultado+ "["+monedaFinal+"]");

    }


}
