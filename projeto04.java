import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String nome1;
        String nome2;

        int idade1;
        int idade2;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome 1: ");
        nome1 = scanner.nextLine();

        System.out.print("Digite o nome 2: ");
        nome2 = scanner.nextLine();

        System.out.print("Digite a idade 1: ");
        idade1 = scanner.nextInt();

        System.out.print("Digite a idade 2: ");
        idade2 = scanner.nextInt();

        System.out.printf("Nome 1: %s, idade 1: %d", nome1, idade1);
        System.out.println("");
        System.out.printf("Nome 2: %s, idade 2: %d", nome2, idade2);


        scanner.close();

    }
}
