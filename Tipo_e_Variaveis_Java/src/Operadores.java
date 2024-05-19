import java.util.Scanner;

// <-- Comentario de uma unica linha

/* <-- Comentario com varias linhas  
 * 
 * 
 */

 /** <-- Comentario do tipo documentação 
  * 

  */

public class Operadores{
        public static void main(String[] args) throws Exception {
            int R=0,V=0; // R é o resultado e o V é o valor digitado
            Scanner input = new Scanner(System.in);
            System.out.println(" Digite um numero");
            V = input.nextInt();
                while(V>0){
                    R=V%2;
                    if (R==0){
                        System.out.println(V+" é par");
                    }else{
                        System.out.println(V+" é impar");
                    }
                V--;
                }
        }   
}
