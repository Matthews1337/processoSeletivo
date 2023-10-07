import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class processoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela" };
        for (String candidato: candidatos){
            entrandoEmContato(candidato);
        }
        
    }


static void entrandoEmContato(String candidato){
    int tentativasRealizadas = 1;
    boolean continuarTentando = true;
    boolean atendeu = false;
    do{
        atendeu = atender();
        continuarTentando = !atendeu;
        if(continuarTentando)
            tentativasRealizadas++;
        else
            System.err.println("Contato realizado com sucesso");
            
}while(continuarTentando && tentativasRealizadas < 3);
if (atendeu)
    System.out.println("Conseguimos contato com" + candidato + "na"+ tentativasRealizadas+ "tentaviva");
else
    System.out.println("Não conseguimos contato com "+ candidato+ ", numero maximo de tentativas" + tentativasRealizadas);
}

private static boolean atender() {
    return new Random().nextInt(3)==1;
}


static void imprimirSelecionados(){
    String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
    System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
    for (int indice =0; indice < candidatos.length; indice++){
        System.out.println("O candidato de numero " + (indice + 1) + "é" + candidatos[indice]);
    }
        
}


    static void selecaoCandidatos(){
        String[] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela" };
        
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato =  candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados ++;
            }
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.00;
        if (salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        }else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }else{
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
    
}
