package SituacaoVacina.Situacoes;

import SituacaoVacina.Habilitacoes.HabSegDose;
import Paciente.Pessoa;
import SituacaoVacina.StateVacinacao;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class TomouPrimeiraDose extends StateVacinacao {

    private LocalDate dataPrimDose = LocalDate.now();

    @Override
    public void stateVacinacao(Pessoa pessoa) {
        LocalDate dataAtual = LocalDate.now();
        long qtdDiasPrimDose = ChronoUnit.DAYS.between(dataPrimDose, dataAtual);
        long diferencaQtdDias = 20 - qtdDiasPrimDose;
        Scanner input = new Scanner(System.in);

        System.out.println("Deseja entrar no processo de habilitação para tomar a segunda dose? (S/N)");
        String opcao = input.nextLine().toUpperCase();

        if(opcao.equals("S") && qtdDiasPrimDose >= 20){
            pessoa.setStateVacinacao(new HabSegDose());
            pessoa.atualizaVacinacao(pessoa);
        }
        else if(opcao.equals("N")){
            System.out.println("Retorne novamente ao sistema, na data que irá receber a segunda dose.\n" + pessoa.toString());

        } else if( qtdDiasPrimDose < 20){
            System.out.print("\nVocê recebeu a primeira dose há " + qtdDiasPrimDose + " dias. \nFaltam " +  diferencaQtdDias + " dias para você estar apto a receber a segunda dose.\n");
            System.out.println("\nRetorne ao sistema daqui a " + diferencaQtdDias + "  dias!" + pessoa.toString() + "\n");
        }
    }

    @Override
    public String toString() {
        return "Paciente recebeu a primeira dose.";
    }
}
