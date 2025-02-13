import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.JsonObject;

public class ConsultaCep {

    public Endereco BuscadorCep(String cep){
        String endereco = "http://viacep.com.br/ws/" + cep + "/json/";

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            JsonObject repostaJson = new Gson().fromJson(response.body(), JsonObject.class);

            // Verifica se há erro na resposta
            if (repostaJson.has("erro") && repostaJson.get("erro").getAsBoolean()) {
                System.out.println("CEP não encontrado!");
                return null;
            }

            return new Gson().fromJson(repostaJson, Endereco.class);

        } catch (Exception e) {
            System.out.println("Não foi possível obter endereço!");
            return null;
        }

    }
}
