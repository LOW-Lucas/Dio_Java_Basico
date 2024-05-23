package Repetição;

import java.util.Random;

public class RepetiçãoDoWhile {

    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu?" + atendeu);
        return ! atendeu;
    } 

    public static void main(String[] args){
        System.out.println("Discando...");

        do{
            System.out.println("Telefone tocanco📳🎵🎵🎵");

        }while(tocando());

        System.out.println("Alô!!!");
    }
}
