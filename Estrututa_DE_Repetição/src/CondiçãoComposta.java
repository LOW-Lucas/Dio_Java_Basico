import java.util.Scanner;

public class CondiçãoComposta {
    public static void main(String[] args){
        int nota1,nota2,nota3,mediaFinal = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor da 1° nota");
        nota1 = input.nextInt();
        System.out.println("Digite o valor da 2° nota");
        nota2 = input.nextInt();
        System.out.println("Digite o valor da 3° nota");
        nota3 = input.nextInt();

        mediaFinal = (nota1+nota2+nota3)/3;

        if(mediaFinal >= 7)
            System.out.println("A sua media final foi: "+mediaFinal+ " - Aprovado");
        else
            System.out.println("A sua media final foi: "+mediaFinal+ " - Reprovado");
    }
}
