import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
        int distancia;
        Double consumoLitro;
        Double litroNecessario;
        Double custoViagem;
        Double precoLitro;
        String cidade;

        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Digite o nome da cidade de destino: ");
        cidade = scanner.nextLine();
        
        System.out.print("Digite a distância até " + cidade + " (em km): ");
        distancia = scanner.nextInt();
        
        System.out.print("Digite quantos km por litro seu carro faz: ");
        consumoLitro = scanner.nextDouble();
        
        System.out.print("Digite o valor do litro da gasolina: R$");
         precoLitro = scanner.nextDouble();
        
        
        litroNecessario = distancia / consumoLitro;
        custoViagem = litroNecessario * precoLitro;
        
        System.out.println("Nome da cidade em que a viagem foi feita: " + cidade);
        System.out.printf("O custo da viagem sera: R$ " + custoViagem);
        
        scanner.close(); 
        
    }
}
