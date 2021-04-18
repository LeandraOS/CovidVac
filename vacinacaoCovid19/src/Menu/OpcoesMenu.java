package Menu;

import Controller.Controller;

import java.util.Scanner;

public enum OpcoesMenu {

    C{
        @Override
        public void opcao(Controller controller, String cadastra) {
            Scanner input = new Scanner(System.in);

            System.out.println("\nDigite o nome: ");
            String nome = input.nextLine().toUpperCase();

            System.out.print("Digite o CPF (11 dígitos): ");
            String cpf = input.nextLine().toUpperCase();

            System.out.print("\nDigite o endereço: ");
            String endereco = input.nextLine().toUpperCase();

            System.out.print("\nDigite o número do cartão do SUS (15 dígitos): ");
            String numeroCartaoSus = input.nextLine().toUpperCase();

            System.out.print("\nDigite o email: ");
            String email = input.nextLine().toUpperCase();

            System.out.print("\nDigite o telefone: ");
            String telefone = input.nextLine().toUpperCase();

            System.out.print("\nDigite a profissão: ");
            String profissao = input.nextLine().toUpperCase();

            System.out.print("\nDigite a idade: ");
            int idade = input.nextInt();
            input.nextLine();

            System.out.print("\nDigite as comorbidades (separadas por vírgula): ");
            String comorbidades = input.nextLine().toLowerCase();

            controller.cadastroUsuario(nome, cpf, endereco,  numeroCartaoSus,  email, telefone, profissao,idade, comorbidades);
        }
    },

    E{
        @Override
        public void opcao(Controller controller, String entra) {
            Scanner input = new Scanner(System.in);
            System.out.println("\nDigite o CPF: ");
            String cpf = input.nextLine();
            controller.entrarNoSistema(cpf);
        }
    },

    A {
        @Override
        public void opcao(Controller controller, String atualiza) {
            Scanner input = new Scanner(System.in);
            System.out.println("\nDigite o nome: ");
            String nome = input.nextLine().toUpperCase();

            System.out.print("Digite o CPF: ");
            String cpf = input.nextLine().toUpperCase();

            System.out.print("\nDigite o telefone: ");
            String telefone = input.nextLine().toUpperCase();

            System.out.print("\nDigite o endereço: ");
            String endereco = input.nextLine().toUpperCase();

            System.out.print("\nDigite o email: ");
            String email = input.nextLine().toUpperCase();

            System.out.print("\nDigite o número do cartão do SUS: ");
            String numeroCartaoSus = input.nextLine().toUpperCase();

            System.out.print("\nDigite a profissão: ");
            String profissao = input.nextLine().toUpperCase();

            System.out.print("\nDigite a idade: ");
            Integer idade = input.nextInt();
            input.nextLine();

            System.out.print("\nDigite as comorbidades (separadas por vírgula): ");
            String comorbidades = input.nextLine().toLowerCase();

            controller.alterarTodosDadosCadastro(nome, cpf, endereco, numeroCartaoSus, email, telefone, profissao, idade, comorbidades);
        }
        },

    M{
        @Override
        public void opcao(Controller controller, String mudaTodos) {
            Scanner input = new Scanner(System.in);
            System.out.print("\nDigite o CPF: ");
            String cpf = input.nextLine().toUpperCase();
            System.out.print("\nDigite o dado que deseja alterar: ");
            String dado = input.nextLine().toUpperCase();
            System.out.print("\nDigite o novo dado: ");
            String novoDado = input.nextLine().toUpperCase();
            controller.alterarDadoCadastro("M",cpf, dado, novoDado);

        }
    },

    EX{
        @Override
        public void opcao(Controller controller, String exibe){
            Scanner input = new Scanner(System.in);
            System.out.print("Digite o CPF: ");
            String CPF = input.nextLine().toUpperCase();
            controller.exibirSituacaoPessoa(CPF);
        }
    },

    I{
        @Override
        public void opcao(Controller controller, String imprime) {
            Scanner input = new Scanner(System.in);
            System.out.print("Digite a situação: ");
            String situacao = input.nextLine().toUpperCase();
        }
    },

    S{
        @Override
        public void opcao(Controller controller, String sai) {
            Scanner input = new Scanner(System.in);
            String sair = input.nextLine().toUpperCase();
        }
    };

    public abstract void opcao (Controller controller, String input);
}


