
public class ProcessoSeletivo{
    public static void main (String[] Args){
        analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);
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
}