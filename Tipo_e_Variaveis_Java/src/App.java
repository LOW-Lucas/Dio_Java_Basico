import java.util.Date;
import java.util.Scanner;

public class App {
        int r = 0;
        int varInt = 0;
        double varDouble = 2.5;
        float varFloat = 52F;
        boolean varBoolean = false;
        char varChar = 'a';
        String varString = "bom dia";
        Date varData = new Date();
    public static void main(String[] args) throws Exception {
        double soma = 10.5 + 12.5;
        int subtração = 10 - 5;
        int multiplicação = 5 * 4;
        int divisão = 20 / 4;
        int modulo = 18 % 3;
        double resultado = (20 * 4) + (20 /4) + modulo + divisão - multiplicação * subtração / soma;

        System.out.println(resultado);
    }
    public void subtraindoNumero(){
        int contador = 10;
        while (contador>0) {
            System.out.println(contador);
            contador--;
        }
    }
}
