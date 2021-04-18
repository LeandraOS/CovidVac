package SituacaoVacina.Habilitacoes;

import Paciente.Pessoa;
import SituacaoVacina.StateVacinacao;
import SituacaoVacina.Situacoes.TomouPrimeiraDose;

import java.util.Scanner;

public class HabPrimeiraDose extends StateVacinacao {
    @Override
    public void stateVacinacao(Pessoa pessoa) {
        Scanner input = new Scanner(System.in);
        System.out.println("Deseja continuar? (S/N)");
        String opcao = input.nextLine().toUpperCase();

        if (opcao.equals("S")) {
            System.out.println("Vá até o posto de saúde mais próximo para receber a primeira dose da vacina.");
            System.out.println("Paciente vacinado? (S/N)");
            String vacinado = input.nextLine().toUpperCase();

            if (vacinado.equals("S")) {
                System.out.println("Aplicação da primeira dose feita com sucesso! Continue se cuidando!");
                System.out.println("\nRetorne ao sistema após 20 dias!");
                pessoa.setStateVacinacao(new TomouPrimeiraDose());
                pessoa.atualizaVacinacao(pessoa);

            } else if (vacinado.equals("N")) {
                System.out.println("Retorne novamente ao sistema, na data que irá receber a primeira dose. \n" + pessoa.toString());

            } else {
                System.out.println("Opção inválida, tente novamente... \n" + pessoa.toString());
            }
        }
    }

    @Override
    public String toString() {
        return "Paciente habilitado(a) para tomar a primeira dose.";
    }
}
