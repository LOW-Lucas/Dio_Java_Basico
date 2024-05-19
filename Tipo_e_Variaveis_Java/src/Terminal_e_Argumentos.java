import java.util.Locale;
import java.util.Scanner;

public class Terminal_e_Argumentos {
    public static void main(String[] args){
        /* 
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);
        */
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome");
        String nome = scanner.next();
        System.out.println("Digite o seu sobrenome");
        String sobrenome = scanner.next();
        System.out.println("Digite a sua idade");
        int idade = scanner.nextInt();
        System.out.println("Digite a sua altura");
        double altura = scanner.nextDouble();
        

        System.out.println("A meu nome é"+nome+" "+sobrenome);
        System.out.println("tenho "+idade+" anos ");
        System.out.println("A minha altura é "+altura);


    }
}
