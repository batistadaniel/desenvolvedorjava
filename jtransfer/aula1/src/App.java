import java.io.FileWriter; // classe para escrever no arquivo
import java.io.IOException; // classe para tratar excessoes do arquivo
import java.nio.charset.Charset;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // declaracao de variaveis
        String nome; // referencia
        int opcaoTransporte; 
        String meioTransporte = "";

        //classe para teclado
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pesquisa de Transporte Diario");

        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();
        System.out.println(nome);

        System.out.println("Como voce vai ao trabalho: ");
        System.out.println("1- Metro");
        System.out.println("2- Onibus");
        System.out.println("3- Caminhada");
        System.out.println("4- Uber");
        System.out.println("5- Taxi");
        System.out.println("6- Carro");
        System.out.print("Escolha uma opcao (1 a 6): ");

        // exercicio
        // faca como eu fiz
        // leia a opcaoTransporte e mostre a opcao lida
        // casting (conversao) - texto/numero
        opcaoTransporte = scanner.nextInt();

        switch (opcaoTransporte) {
            case 1:
                meioTransporte = "Metro";
                break;
            case 2:
                meioTransporte = "Onibus";
                break;
            case 3:
                meioTransporte = "Caminhada";
                break;
            case 4:
                meioTransporte = "Uber";
                break;
            case 5:
                meioTransporte = "Taxi";
                break;
            case 6:
                meioTransporte = "Carro";
                break;
            default:
                break;
        }
    
        // task de amanha: salvar os dados no arquivo
        // task no github (git github)
        System.out.println(nome + "," + meioTransporte);

        try(FileWriter escritor = new FileWriter("dados.txt", true)) {
            escritor.write(nome + "," + meioTransporte + "\n");
            System.out.println("Dados gravados com sucesso");

        } catch (IOException e) {
            System.out.println("Erro ao gravar os dados"+ e.getMessage());
        }
    }

}


// comentario para teste
