import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    public String menuDeOperacoes(){
        String escolha;

        do{
            System.out.print("\n********OPERAÇÕES********\n0- Sair\n1- Consultar CEP\nEscolha uma das operações: ");
            escolha = scanner.nextLine();
        }while(!escolha.equals("0") && !escolha.equals("1"));

        return escolha;
    }
    public String informeCep(){
        String cep;
        boolean valido;

        do{
            System.out.print("\n********OPERAÇÃO 1*******\nInforme o cep: ");
            cep = scanner.nextLine();
            if(cep.length() != 8){
                System.out.println("Cep Inválido! Deve conter 8 caracteres!");
                valido = false;
            }else if(cep.matches(".*[a-zA-Z].*")){
                System.out.println("Cep inválido! Deve conter apenas numeros!");
                valido = false;
            }else{
                valido = true;
            }
        }while(!valido);

        return cep;
    }
    public void fechaMenu(){
        System.out.println("""
                
                ********ENCERRADO********
                Programa finalizado!
                *************************
                """);
    }
}
