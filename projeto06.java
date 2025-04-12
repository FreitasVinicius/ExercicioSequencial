import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    int soma1;
    int soma2;
    
    int num1;
    int num2;
    int num3;
    int num4;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o primeiro par de numeros: ");
     num1 = scanner.nextInt();
     num2 = scanner.nextInt();
     soma1 = num1 + num2;

    System.out.println("Digite o segundo par de numeros: ");
     num3 = scanner.nextInt();
     num4 = scanner.nextInt();
     soma2 = num3 + num4;

    System.out.printf("Soma do primeiro par: %d", soma1);
    System.out.println();
    System.out.printf("Soma do segundo par: %d", soma2);

   scanner.close();
   
    }
}
