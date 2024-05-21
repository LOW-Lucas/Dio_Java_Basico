import java.util.Scanner;

public class CondiçãoTernaria {
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

        String resultado =mediaFinal >=7 ? "Aprovado": mediaFinal >=5 && mediaFinal < 7 ? "Recuperação":"Reprovado";
        System.out.println(resultado);
    }
}
