package Repetição;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args){
        int escolha;
        
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha uma das seguintes opções:");
        System.out.println("1) break");
        System.out.println("2) continue");
        escolha = input.nextInt();
        switch (escolha) {
            case 1:
                for(int cont=0;cont<=5;cont++){
                    if(cont==3)
                        break;  
                        System.out.println(cont);
                }
                break;
            case 2:
                for(int cont=0;cont<=5;cont++){
                    if(cont==3)
                        continue;  
                        System.out.println(cont);
                }
                break;
            default:
                System.out.println("valor indefinido");
                break;
        }
    }
}
