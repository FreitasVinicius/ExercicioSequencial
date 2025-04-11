import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String nome1;
        String nome2;

        int idade1;
        int idade2; 

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro nome: ");
        nome1 = scanner.nextLine();

        System.out.print("Digite a primeira idade: ");
        idade1 = scanner.nextInt();
        scanner.nextLine(); //consumir quebra de linha

        System.out.print("Digite o segundo nome: ");
        nome2 = scanner.nextLine();

        System.out.print("Digite a primeira idade: ");
        idade2 = scanner.nextInt();

        
        System.out.printf("Nome1: %s, Idade1: %d ", nome1, idade1);
        System.out.println();
        System.out.printf("Nome2: %s, Idade2: %d ", nome2, idade2);


        scanner.close();

    }
}
