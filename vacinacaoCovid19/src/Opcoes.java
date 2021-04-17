import java.util.Scanner;

public enum Opcoes {

    C{
        @Override
        public void opcao(String inpu) {
            Scanner input = new Scanner(System.in);

            System.out.println("\nDigite o nome: ");
            String nome = input.nextLine();

            System.out.print("\nDigite o CPF: ");
            String cpf = input.nextLine();

            System.out.print("\nDigite o telefone: ");
            String telefone = input.nextLine();

            System.out.print("\nDigite o endereço: ");
            String endereco = input.nextLine();

            System.out.print("\nDigite o email: ");
            String email = input.nextLine();

            System.out.print("\nDigite o número do cartão do SUS: ");
            String numeroCartaoSus = input.nextLine();

            System.out.print("\nDigite a profissão: ");
            String profissao = input.nextLine();

            System.out.print("\nDigite as comorbidades (separadas por vírgula): ");
            String comorbidades = input.nextLine();

        }
    },

    E{
        @Override
        public void opcao(String inpu){
            Scanner input = new Scanner(System.in);
            System.out.print("Digite o CPF: ");
            String cpfUsuario = input.nextLine();

        }
    },

    I{
        @Override
        public void opcao(String inpu) {
            Scanner input = new Scanner(System.in);
            System.out.print("Digite a situação: ");
            String situacao = input.nextLine();
        }
    },

    A{
        @Override
        public void opcao(String inpu) {
            Scanner input = new Scanner(System.in);
            System.out.println("\nDigite o nome: ");
            String nome = input.nextLine();

            System.out.print("\nDigite o CPF: ");
            String cpf = input.nextLine();

            System.out.print("\nDigite o telefone: ");
            String telefone = input.nextLine();

            System.out.print("\nDigite o endereço: ");
            String endereco = input.nextLine();

            System.out.print("\nDigite o email: ");
            String email = input.nextLine();

            System.out.print("\nDigite o número do cartão do SUS: ");
            String numeroCartaoSus = input.nextLine();

            System.out.print("\nDigite a profissão: ");
            String profissao = input.nextLine();

            System.out.print("\nDigite as comorbidades (separadas por vírgula): ");
            String comorbidades = input.nextLine();
        }
    },

    S{
        @Override
        public void opcao(String inpu) {
            Scanner input = new Scanner(System.in);
            String sair = input.nextLine();
        }
    };

    public abstract void opcao (String input);
}


