package SituacaoVacina.Habilitacoes;

import Paciente.Pessoa;
import SituacaoVacina.Situacoes.TomouPrimeiraDose;
import SituacaoVacina.StateVacinacao;
import SituacaoVacina.Situacoes.VacFinalizada;

import java.util.Scanner;

public class HabSegDose extends StateVacinacao {
    @Override
    public void stateVacinacao(Pessoa pessoa) {
        Scanner input = new Scanner(System.in);
        System.out.println("Você está habilitado para tomar a segunda dose, deseja continuar? (S/N)");
        String opcao = input.nextLine().toUpperCase();
        if (opcao.equals("S")) {
            System.out.println("Vá até o posto de saúde mais próximo para receber a segunda dose da vacina.");
            System.out.println("Paciente vacinado? (S/N)");
            String vacinado = input.nextLine().toUpperCase();
            if (vacinado.equals("S")) {
                System.out.println("Aplicação da segunda dose feita com sucesso! Continue se cuidando! \n" +  pessoa.toString());
                pessoa.setStateVacinacao(new VacFinalizada());
                pessoa.atualizaVacinacao(pessoa);
            } else if (vacinado.equals("N")) {
                System.out.println("Retorne novamente ao sistema, na data que irá receber a segunda dose. \n" +  pessoa.toString());
            } else {
                System.out.println("Opção inválida, tente novamente...\n" + pessoa.toString());
            }
        }
    }
}
