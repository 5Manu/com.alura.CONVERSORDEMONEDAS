import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        System.out.println("Por favor ingresa tu moneda principal");
        String monedaUno = scanner.nextLine();
        System.out.println("por favor ingresa tu moneda a convertir");
        String monedaDos = scanner.nextLine();
        System.out.println("Por favor ingresa el monto que deseas convertir");
        int monto = scanner.nextInt();


        String direccion = "https://v6.exchangerate-api.com/v6/1613320cb33d3232e8626ef6/pair/" + monedaUno + "/" + monedaDos + "/" + monto;
        System.out.println("PRUEba");




    }
}
