import java.util.Scanner;

public class Operadores{
        public static void main(String[] args) throws Exception {
            int varInt=0,r=0;
            Scanner input = new Scanner(System.in);
            System.out.println(" Digite um numero");
            r = input.nextInt();
                while(r>0){
                    varInt=r%2;
                    if (varInt==0){
                        System.out.println(r+" é par");
                    }else{
                        System.out.println(r+" é impar");
                    }
                r--;
                }
        }   
}
