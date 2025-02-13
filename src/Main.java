import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        ConsultaCep buscaCep = new ConsultaCep();
        Endereco endereco ;
        String cep;
        Menu menu = new Menu();
        List<Endereco> listaDeEnderecos = new ArrayList<>();

        GeradorDeArquivo gerador = new GeradorDeArquivo();

        int escolha;
        do{
            escolha = Integer.parseInt(menu.menuDeOperacoes());

            switch (escolha){
                case 0:
                    menu.fechaMenu();
                    break;
                case 1:
                    cep = menu.informeCep();
                    endereco = buscaCep.BuscadorCep(cep);

                    if(endereco != null) {
                        listaDeEnderecos.add(endereco);
                        System.out.print(endereco);
                    }
                    break;
            }
        }while(escolha != 0);

        gerador.GeradorDeArquivosJson(listaDeEnderecos);
    }
}