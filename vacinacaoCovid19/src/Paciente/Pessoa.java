package Paciente;

import SituacaoVacina.Habilitacoes.NaoHabilitada;
import SituacaoVacina.StateVacinacao;

import java.util.Arrays;
import java.util.Objects;

public class Pessoa {

    private String nomeCompleto;
    private String CPF;
    private String endereco;
    private String numCartaoSUS;
    private String email;
    private String telefone;
    private String profissao;
    private Integer idade;
    private String [] comorbidades;
    private StateVacinacao stateVacinacao;

    public Pessoa(String nomeCompleto, String CPF, String endereco, String numCartaoSUS, String email, String telefone, String profissao, Integer idade, String comorbidades) {
        this.nomeCompleto = nomeCompleto;
        this.CPF = CPF;
        this.endereco = endereco;
        this.numCartaoSUS = numCartaoSUS;
        this.email = email;
        this.telefone = telefone;
        this.profissao = profissao;
        this.comorbidades = comorbidades.split(", ");
        this.idade = idade;

        this.stateVacinacao = new NaoHabilitada();
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public StateVacinacao getStateVacinacao() {
        return stateVacinacao;
    }

    public String [] getComorbidades() {
        return this.comorbidades;
    }

    public void setStateVacinacao(StateVacinacao stateVacinacao) {
        this.stateVacinacao = stateVacinacao;
    }

    public void atualizaVacinacao(Pessoa pessoa){
        stateVacinacao.stateVacinacao(pessoa);
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumCartaoSUS() {
        return numCartaoSUS;
    }

    public void setNumCartaoSUS(String numCartaoSUS) {
        this.numCartaoSUS = numCartaoSUS;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public void setComorbidades(String comorbidades) {
        this.comorbidades = comorbidades.split(", ");
    }

    public void setDado(String opcao, String dado, String dadoNovo) {
        if (opcao.equals("M")) {
            if (dado.equals("NOME")) {
                this.setNomeCompleto(dadoNovo);

            } else if (dado.equals("CPF")) {
                this.setCPF(dadoNovo);

            } else if (dado.equals("ENDERECO")) {
                this.setEndereco(dadoNovo);

            } else if (dado.equals("TELEFONE")) {
                this.setTelefone(dadoNovo);

            } else if (dado.equals("EMAIL")) {
                this.setEmail(dadoNovo);

            } else if (dado.equals("CARTAO SUS")) {
                this.setNumCartaoSUS(dadoNovo);

            } else if (dado.equals("PROFISSAO")) {
                this.setProfissao(dadoNovo);

            } else if (dado.equals("COMORBIDADES")) {
                this.setComorbidades(dadoNovo);

            } else {
                System.out.println("Dado não pode ser alterado, pois não existe! Tente novamente...");
            }
        }
    }

    public void setTodosDados(String nomeCompleto, String CPF, String endereco, String numCartaoSUS, String email, String telefone, String profissao, Integer idade, String comorbidades){
        this.setNomeCompleto(nomeCompleto);
        this.setCPF(CPF);
        this.setEndereco(endereco);
        this.setNumCartaoSUS(numCartaoSUS);
        this.setEmail(email);
        this.setTelefone(telefone);
        this.setProfissao(profissao);
        this.setIdade(idade);
        this.setComorbidades(comorbidades);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(nomeCompleto, pessoa.nomeCompleto) && Objects.equals(CPF, pessoa.CPF) && Objects.equals(endereco, pessoa.endereco) && Objects.equals(numCartaoSUS, pessoa.numCartaoSUS) && Objects.equals(email, pessoa.email) && Objects.equals(telefone, pessoa.telefone) && Objects.equals(profissao, pessoa.profissao) && Objects.equals(comorbidades, pessoa.comorbidades);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeCompleto, CPF, endereco, numCartaoSUS, email, telefone, profissao, comorbidades);
    }

    @Override
    public String toString() {
        return "\nNome completo: " + nomeCompleto + '\n'+
                "CPF: " + CPF  +  '\n'+
                "Endereco: " + endereco  + '\n' +
                "Número Cartão do SUS: " + numCartaoSUS  + '\n'+
                "Email: " + email  +'\n'+
                "Telefone: " + telefone  +'\n'+
                "Profissao: " + profissao  +'\n'+
                "Comorbidades: " + Arrays.toString(comorbidades) +'\n' +
                "Situação: " + stateVacinacao.toString();
    }
     public String toStringSituacao(){
        return "Situação: " + stateVacinacao.toString();
     }
}
