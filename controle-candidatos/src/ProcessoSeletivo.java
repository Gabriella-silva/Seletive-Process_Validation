import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] Args) {
        // Chamando o método para analisar candidatos
        analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);

        // Chamando o método para selecionar candidatos
        selecaoCandidatos();
        ImprimirCandidatos();
    }
static void ImprimirCandidatos (){
    String[] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio"};
System.out.println("Imprimindo a lista de candidatos informando o indice do Elemento");

for(int indice = 0; indice < candidatos.length; indice++){
    System.out.println("Indice: " + (indice+1) + " - Candidato: " + candidatos[indice]);
}

}
    static void selecaoCandidatos() {
        String[] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este salário: " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato selecionado foi: " + candidato);
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO DEMAIS CANDIDATOS");
        }
    }

    // Método para gerar um valor de salário pretendido aleatório
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}