import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double altura = 0;
        double peso = 0;
        double imc = 0;  


        System.out.println("Digite a sua altura : ");
        altura = scanner.nextDouble();

        System.out.println("Digite o seu peso : ");
        peso = scanner.nextDouble();

        imc = peso / (altura * altura);

        System.out.println("Seu IMC é : " + imc);

        scanner.close();
        
    }
}
