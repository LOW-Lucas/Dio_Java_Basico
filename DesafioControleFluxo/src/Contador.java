import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = input.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = input.nextInt();	
		try {
			
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if(parametroUm>parametroDois)
			throw new ParametrosInvalidosException();

		int contagem = parametroDois - parametroUm;
		System.out.println("Resultado da contagem: "+contagem);
		for(int cont=1;cont<=contagem;cont++){
			System.out.println("Imprimindo o numero: "+cont);
		}

	}
}
