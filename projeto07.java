import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
     String name1;
     String name2;
     String name3;     
     String name4;
     String name5;
     String name6;

     int idade1;
     int idade2;
     int idade3;
     int idade4;
     int idade5;
     int idade6;

     int soma;
     double media;

     Scanner scanner = new Scanner(System.in);

     System.out.println("Digite o primeiro nome: ");
     name1 = scanner.nextLine();
     System.out.println("Digite o segundo nome: ");
     name2 = scanner.nextLine();
     System.out.println("Digite o terceiro nome: ");
     name3 = scanner.nextLine(); 
     System.out.println("Digite o quarto nome: ");
     name4 = scanner.nextLine(); 
     System.out.println("Digite o quinto nome: ");
     name5 = scanner.nextLine();
     System.out.println("Digite o sexto nome: ");
     name6 = scanner.nextLine();

     System.out.println("Digite a primeira idade: ");
     idade1 = scanner.nextInt();
     System.out.println("Digite a segunuda idade: ");
     idade2 = scanner.nextInt();
     System.out.println("Digite a terceira idade: ");
     idade3 = scanner.nextInt();
     System.out.println("Digite a quarta idade: ");
     idade4 = scanner.nextInt();
     System.out.println("Digite a quinta idade: ");
     idade5 = scanner.nextInt();
     System.out.println("Digite a sexta idade: ");
     idade6 = scanner.nextInt();

     soma = idade1 + idade2 + idade3 + idade4 + idade5 + idade6;
     media = (idade1 + idade2 + idade3 + idade4 + idade5 + idade6) / 6 ;

     System.out.println("Nome 1 = " + name1 + ", Idade 1 = " + idade1  );
     System.out.println("Nome 2 = " + name2 + ", Idade 2 = " + idade2  );
     System.out.println("Nome 3 = " + name3 + ", Idade 3 = " + idade3  );
     System.out.println("Nome 4 = " + name4 + ", Idade 4 = " + idade4  );
     System.out.println("Nome 5 = " + name5 + ", Idade 5 = " + idade5  );
     System.out.println("Nome 6 = " + name6 + ", Idade 6 = " + idade6  );
     
     System.out.println("SOMA: " + soma);
     System.out.println("MEDIA: " + media);

     scanner.close();
     
    }
}
