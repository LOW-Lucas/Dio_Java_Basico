import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    
    public static void main(String[] args) throws Exception {
        String [] candidatos = {"Felipe","Lucas","Marcia","Paulo"};
        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }
    }
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando =  !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;;
            }else{
                System.out.println("contato realizado com sucesso");
            }
        }while(continuarTentando && tentativasRealizadas < 3);
        if(atendeu){
            System.out.println("Conseguimos contato com "+candidato+" na "+tentativasRealizadas+" tentativa");
        }else{
            System.out.println("Não conseguimos contato com "+candidato+" numero maximo tentativas "+tentativasRealizadas+" realizada");
        }

    }
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }
    static void imprimirSelecionados(){
        String [] candidatos = {"Felipe","Lucas","Marcia","Paulo","Julia","Monica","Gustavo","Victor","João","Matheus","Larissa","Carlos"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
        for(int indice=0; indice < candidatos.length; indice++){
             System.out.println("O candidato de n° "+(indice+1)+" é "+candidatos[indice]);
        }
    }
    static void seleçãoCandidatos(){
            String [] candidatos = {"Felipe","Lucas","Marcia","Paulo","Julia","Monica","Gustavo","Victor","João","Matheus","Larissa","Carlos","Jose","Rebecca","Arthur","jonas","Ana","Jennifer"};
            int candidatosSelecionados = 0;
            int cantidatoAtual = 0;
            double salarioBase = 2000.0;
            while(candidatosSelecionados < 5 && cantidatoAtual < candidatos.length){
                String candidato = candidatos[cantidatoAtual];
                double salarioPretendido = valorPretendido();
                System.out.println("----------------------------------------------------------");
                System.out.println("O candidato "+candidato+" solicitou este valor de salario "+salarioPretendido);
                if(salarioBase >= salarioPretendido){
                    System.out.println("O candidato "+candidato+" foi selecionado para a vaga");    
                    candidatosSelecionados++;
                }else{
                    System.out.println("O candidato "+candidato+" não foi selecionado para a vaga");
                }
                cantidatoAtual++;
            }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        }else if(salarioBase==salarioPretendido)
            System.out.print("Aguardando o resultado dos demais candidatos");
        else{
            System.out.print("Aguardando o resultado dos demais candidatos");
        }
    }
}
