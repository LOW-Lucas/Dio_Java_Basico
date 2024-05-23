package Condição;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args){
        String sigla;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a sigla do seu tamanho");
        sigla = input.next();
        sigla = sigla.toUpperCase();

        switch (sigla){
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MEDIO");
                break;
            }
            case "G":{
                System.out.println("GRANDE");
                break;
            }
            default:
                System.out.println("Valor indefinido");
        }
    }
}
