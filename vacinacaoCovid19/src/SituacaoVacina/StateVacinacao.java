package SituacaoVacina;

import Paciente.Pessoa;

public abstract class StateVacinacao {
    public abstract void stateVacinacao(Pessoa pessoa);
    public abstract String toString();
}

