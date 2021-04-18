package SituacaoVacina.Situacoes;

import Paciente.Pessoa;
import SituacaoVacina.StateVacinacao;

public class VacFinalizada extends StateVacinacao {
    @Override
    public void stateVacinacao(Pessoa pessoa) {
        System.out.println("Parabéns!!! Você finalmente está imunizado contra a COVID-19. Continue se cuidando!");
        System.out.println(pessoa.toString());
    }

    @Override
    public String toString() {
        return "Paciente imunizado!";
    }
}
