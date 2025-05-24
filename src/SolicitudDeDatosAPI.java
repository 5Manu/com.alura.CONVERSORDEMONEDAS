import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class SolicitudDeDatosAPI {


    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create("https://v6.exchangerate-api.com/v6/1613320cb33d3232e8626ef6/pair/" +monedaUno + "/" + monedaDos + "/" + monto))
            .uri(URI.create("https://v6.exchangerate-api.com/v6/1613320cb33d3232e8626ef6/latest/USD"))
            .build();
    HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());

    String json = response.body();


    Gson gson = new Gson();
    Serialized respuesta = gson.fromJson(json, Serialized.class);

    double monedaUSD = respuesta.conversion_rates().USD();
    double monedaCLP = respuesta.conversion_rates().CLP();
    double monedaARS = respuesta.conversion_rates().ARS();
    double monedaBRL = respuesta.conversion_rates().BRL();
    double monedaBOB = respuesta.conversion_rates().BOB();
    double monedaCOP = respuesta.conversion_rates().COP();


    public SolicitudDeDatosAPI() throws IOException, InterruptedException {
    }
}
