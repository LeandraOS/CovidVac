package SituacaoVacina.Habilitacoes;

import Paciente.Pessoa;
import SituacaoVacina.StateVacinacao;
import Validacao.Validacao;

public class NaoHabilitada extends StateVacinacao {

    private Validacao validacao = new Validacao();

    @Override
    public void stateVacinacao(Pessoa pessoa) {
        if (pessoa.getIdade() >= 60 || validacao.validaProfissao(pessoa.getProfissao()) || validacao.validaComorbidade(pessoa.getComorbidades())){
            System.out.println("\nVocê está devidamente habilitado(a) para tomar a primeira dose da vacina!");
            pessoa.setStateVacinacao(new HabPrimeiraDose());
            pessoa.atualizaVacinacao(pessoa);
        }else{
            System.out.println("\nInfelizmente vocẽ não está habilitado(a) para tomar a primeira dose da vacina, no momento. \n" +  pessoa.toString());
        }
    }

    @Override
    public String toString() {
        return "Paciente não habilitado(a) para tomar a primeira dose.";
    }
}


