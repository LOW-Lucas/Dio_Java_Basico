import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        String nomeCliente,Agencia;
        int numero = 0;
        double saldo = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome!");
        nomeCliente = input.next();
        System.out.println("Por favor, digite a sua Agencia!");
        Agencia = input.next();
        System.out.println("Por favor, digite o numero da Agencia!");
        numero = input.nextInt();
        System.out.println("Por favor, digite o seu saldo atual!");
        saldo = input.nextDouble();

        System.out.print("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+Agencia+", conta "+numero+" e o seu saldo: "+saldo+" já está disponivel para saque.");
    }
}
