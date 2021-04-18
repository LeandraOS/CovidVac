package Controller;

import Paciente.Pessoa;

import java.util.HashMap;
import java.util.Map;

public class Controller {
    private Map<String, Pessoa> mapPessoas;

    public Controller() {
        this.mapPessoas = new HashMap<String, Pessoa>();
    }
    public void cadastroUsuario(String nome, String CPF, String endereco, String numeroCartaoSus, String email,
                                String telefone, String profissao, int idade, String comorbidades) {
        if (CPF.length() != 11) {
            System.out.printf("Cadastro não realizado. CPF %s inválido! Tente novamente...\n", CPF);
        }
        else if(numeroCartaoSus.length() != 15){
            System.out.printf("Cadastro não realizado. Número do cartão do SUS - %s inválido! Tente novamente...\n", numeroCartaoSus);

        } else {
            Pessoa pessoaNova = new Pessoa(nome, CPF, endereco, numeroCartaoSus, email, telefone, profissao, idade,
                    comorbidades);
            this.mapPessoas.put(CPF, pessoaNova);

            pessoaNova.atualizaVacinacao(pessoaNova);
            System.out.println(String.format("\nUsuário cadastrado com sucesso! %s\n"));
        }
    }
    public void entrarNoSistema (String cpf){
        if(mapPessoas.containsKey(cpf)){
            Pessoa pessoa = this.mapPessoas.get(cpf);
            pessoa.atualizaVacinacao(pessoa);

        }else{
            System.out.println("Paciente com CPF - "+ cpf + "não cadastrado!! Tente novamente...");
        }
    }
    public void alterarDadoCadastro(String opcao, String CPF, String nomeDado, String novoDado) {
        if (this.mapPessoas.containsKey(CPF)) {
            Pessoa pessoa = this.mapPessoas.get(CPF);
            pessoa.setDado(opcao, nomeDado, novoDado);
            System.out.printf("\n%s alterado com sucesso!\n", nomeDado);
            System.out.printf("Dados atualizados: %s\n", pessoa.toString());
        } else {
            System.out.printf("\nUsuário com CPF %s não encontrado! Tente novamente...%n", CPF);
        }
    }

    public void alterarTodosDadosCadastro(String nomeCompleto, String CPF, String endereco, String numCartaoSUS, String email, String telefone, String profissao, Integer idade, String comorbidades) {
        if (this.mapPessoas.containsKey(CPF)) {
            Pessoa pessoa = this.mapPessoas.get(CPF);
            pessoa.setTodosDados(nomeCompleto, CPF, endereco, numCartaoSUS, email, telefone, profissao, idade, comorbidades);
            System.out.println("\nDados alterados com sucesso!");
            System.out.printf("Dados atualizados: %s", pessoa.toString());

        } else {
            System.out.printf("\n%s - %s não cadastrado no sistema! Tente novamente...%n", nomeCompleto, CPF);
        }
    }

    public void exibirSituacaoPessoa(String CPF){
        if(!this.mapPessoas.containsKey(CPF)){
            System.out.println(String.format("\nPaciente.Pessoa com CPF - %s não está cadastrada! Tente novamente...\n", CPF));
        }
        else{
            System.out.println(this.mapPessoas.get(CPF).toStringSituacao());
        }
    }
}


