package api;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Cs2apiCliente {
   // Construct
   public Cs2apiCliente() {}

   // Methods
   public String returnPlayerStats(String playerName) {
       try {
           HttpClient client = HttpClient.newHttpClient();

           HttpRequest request = HttpRequest.newBuilder()
                   .uri(URI.create("https://api.balldontlie.io/cs/v1/players/1"))
                   .header("Authorization", "YOUR_API_KEY")
                   .GET()
                   .build();

           HttpResponse<String> response =
                   client.send(request, HttpResponse.BodyHandlers.ofString());
           return response.body();

       } catch (Exception e) {
           return "Erro ao buscar dados do jogador.";
       }
   }
}
