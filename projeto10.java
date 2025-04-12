import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double km1;
        double km2;
        double distancia;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira quilometragem : ");
        km1 = scanner.nextDouble();

        System.out.print("Digite a segunda quilometragem : ");
        km2 = scanner.nextDouble();

        distancia = km1 - km2;

        System.out.println("A distancia entre os pontos é " + distancia + "km");


        scanner.close();
        
    }
}
