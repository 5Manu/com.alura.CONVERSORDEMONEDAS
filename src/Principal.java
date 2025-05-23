import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal extends Estructuras{
    public static void main(String[] args) throws IOException, InterruptedException {




        Scanner scanner = new Scanner(System.in);
//        System.out.println("Por favor ingresa tu moneda principal");
//        String monedaUno = scanner.nextLine().toUpperCase();
//        System.out.println("por favor ingresa tu moneda a convertir");
//         String monedaDos = scanner.nextLine().toUpperCase();
//        System.out.println("Por favor ingresa el monto que deseas convertir");
//        int monto = scanner.nextInt();

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create("https://v6.exchangerate-api.com/v6/1613320cb33d3232e8626ef6/pair/" +monedaUno + "/" + monedaDos + "/" + monto))
                .uri(URI.create("https://v6.exchangerate-api.com/v6/1613320cb33d3232e8626ef6/latest/USD"))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());


//            String direccion = "https://v6.exchangerate-api.com/v6/1613320cb33d3232e8626ef6/pair/" + monedaUno + "/" + monedaDos + "/" + monto;
    String json = response.body();
            System.out.println(json);

        Gson gson = new Gson();
        Serialized respuesta = gson.fromJson(json, Serialized.class);




//        System.out.println("La conversión de " + monto + " " + monedaUno + " a " + monedaDos + " sería: " + conversionMonto.conversion_result());

        //TAREA:
        // crear VAR de "respuesta.conversion_rates().CLP()" para facilitar su uso.



        System.out.println("5 USD es igual a: " + respuesta.conversion_rates().CLP() * 5 + "$ CLP");
        System.out.println("5000$ CLP es igual a: " + 5000 / respuesta.conversion_rates().CLP() + "$ Dólares" );

        System.out.println(conversionDeMonedas(5000, 5));



    }
}
