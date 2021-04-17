import java.util.HashMap;
import java.util.Map;

public class Controller {
    private Map<String, Pessoa> mapPessoas;

    public Controller() {
        this.mapPessoas = new HashMap<String, Pessoa>();
    }

    public void cadastroUsuario(String nome, String CPF, String endereco, String numeroCartaoSus, String email,
                                String telefone, String profissao, String comorbidades) {
        if (CPF.length() != 11 ) {
            System.out.printf("Cadastro não realizado. CPF %s inválido! Tente novamente...%n", CPF);

        } else {
            Pessoa pessoaNova = new Pessoa(nome, CPF, endereco, numeroCartaoSus, email, telefone, profissao,
                    comorbidades);
            this.mapPessoas.put(CPF, pessoaNova);
            System.out.println(String.format("\nUsuário cadastrado com sucesso! %s\n", pessoaNova.toString()));

        }
    }

    public void alterarDadoCadastro(String opcao, String CPF, String nomeDado, String novoDado) {
        if (this.mapPessoas.containsKey(CPF)) {
            Pessoa pessoa = this.mapPessoas.get(CPF);
            pessoa.setDado(opcao, nomeDado, novoDado);
            System.out.printf("\n%s opcao alterado com sucesso!\n", opcao);
            System.out.printf("Dados atualizados: %s", pessoa.toString());
        } else {
            System.out.printf("\nUsuário com CPF %s não encontrado! Tente novamente...%n", CPF);
        }
    }

    public void alterarTodosDadosCadastro(String nomeCompleto, String CPF, String endereco, String numCartaoSUS, String email, String telefone, String profissao, String comorbidades) {
        if (this.mapPessoas.containsKey(CPF)) {
            Pessoa pessoa = this.mapPessoas.get(CPF);
            pessoa.setTodosDados(nomeCompleto, CPF, endereco, numCartaoSUS, email, telefone, profissao, comorbidades);
            System.out.println("\nDados alterados com sucesso!");
        } else {
            System.out.printf("\n%s - %s não cadastrado no sistema! Tente novamente...%n", nomeCompleto, CPF);
        }
    }

    public void exibirPessoa(String CPF){
        if(!this.mapPessoas.containsKey(CPF)){
            System.out.println(String.format("\nPessoa com CPF - %s não está cadastrada! Tente novamente...\n", CPF));
        }
        else{
            System.out.println(this.mapPessoas.get(CPF).toString());
        }
    }
}

