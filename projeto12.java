import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tempo percorrido da viagem : ");
        int tempo = scanner.nextInt();

        System.out.print("Digite a distancia percorrida da viagem : ");
        int distancia = scanner.nextInt();

        double velocidadeMedia = distancia / tempo;

        System.out.printf("velocidade média: " + velocidadeMedia + "km/h");
        scanner.close();
    }
}