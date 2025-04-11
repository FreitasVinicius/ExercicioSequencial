import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String nome1;
        String nome2;

        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o primeiro nome: ");
        nome1 = scanner.nextLine();

        System.out.print("Digite o segundo nome: ");
        nome2 = scanner.nextLine();

       System.out.println("Nome1: " + nome1);
       System.out.println("Nome2: " + nome2);

       scanner.close();
    }
}
