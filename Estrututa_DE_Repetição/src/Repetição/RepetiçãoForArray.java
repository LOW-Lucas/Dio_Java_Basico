package Repetição;

public class RepetiçãoForArray {
    public static void main(String[] args){
        String alunos[] = {"Lucas", "Matheus", "jose", "Felipe", "Carlos"};

        for(int cont=0;cont<alunos.length;cont++){
            System.out.println("O aluno ni indice "+cont+" é o "+alunos[cont]);
        }
    }
}
