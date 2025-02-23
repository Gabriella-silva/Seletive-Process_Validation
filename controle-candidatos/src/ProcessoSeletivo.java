//biblioteca random
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo{
    public static void main (String[] Args){
        /*analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);
    }*/}
    static void selecaoCandidatos (){
        String [] candidatos = {"Felipe", "Marcia", " Julia", "Paulo", "Augusto", "Monica", "Fabricio"};
    }


    static void analisarCandidato( double salarioPrtendido){
        double salarioBase = 2000.0;
            if(salarioBase > salarioPrtendido){
        System.out.println("LIGAR PARA O CANDIDATO");
        }
            else if(salarioBase == salarioPrtendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }
            else{
        System.out.println("AGUARDANDO DEMAIS CANDIDATOS");
    }
    }

    /*Case 2 : Foi solicitado que nosso sistema garanta que sejamm selecionados apenas 5 candidaturas onde o salario seja menor ou igual */

//biblioteca random
static double valolorPretendido(){
    return ThreadLocalRandom.current().nextDouble(1800, 2200);
}



}