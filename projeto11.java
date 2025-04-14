import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class projeto11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite a temperatura em graus celsius: ");
        int grauCelsius = scanner.nextInt();

        double grauFahrenheit = (grauCelsius * 9/5) + 32;

        System.out.println("A temperatura em Fahrenheit é " + grauFahrenheit);

        scanner.close();
    }
}
