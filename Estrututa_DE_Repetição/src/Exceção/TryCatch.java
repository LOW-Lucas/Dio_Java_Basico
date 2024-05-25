package Exceção;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args){
        try{
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome: ");
        String nome = input.next();
        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = input.next();
        System.out.println("Digite a sua idade: ");
        int idade = input.nextInt();
        System.out.println("Digite a sua altura: ");
        double altura = input.nextDouble();

        System.out.println("olá, me chamo "+nome.toUpperCase()+" "+sobrenome.toUpperCase());
        System.out.println("Tenho "+idade+" anos ");
        System.out.println("minha altura é "+altura+" cm");
        input.close();
        }
        catch(InputMismatchException e){
            System.out.println("O campos idade e altura tem que ser numerico")
;        }
    }
}
