import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GeradorDeArquivo {

    public void GeradorDeArquivosJson(List<Endereco> lista) throws IOException{
        Gson json = new GsonBuilder().setPrettyPrinting().create();

        FileWriter escrita = new FileWriter("enderecos.json");
        escrita.write(json.toJson(lista));
        escrita.close();
    }
}
