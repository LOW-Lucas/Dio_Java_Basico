package Repetição;

import java.util.concurrent.ThreadLocalRandom;

public class RepetiçãoWhile {
    public static void main(String[] args){
        double mesada = 50.0;
        int cont = 0;
        while(mesada>0){
            Double valorDoce = valorAleatorio();
            if(valorDoce>mesada)
                valorDoce=mesada;
            cont++;
            System.out.println(cont+" - Doce de valor: "+valorDoce+" adicionado");
            mesada = mesada - valorDoce;
            
        }
        System.out.println("Mesada: "+mesada);
        System.out.println("Quantidade de compras realizado: "+cont);
        System.out.println("Gastou tudo!!!");
    }
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,10);
    }
}
