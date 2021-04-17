import java.util.Scanner;

public enum AtualizaDados {

    NOME{
        @Override
        public void dados(String dados) {
            System.out.println("\nDigite o nome: ");
            Scanner input = new Scanner(System.in);
            String novoNome = input.nextLine();
        }
    },

    CPF{
        @Override
        public void dados(String dados) {
            System.out.print("\nDigite o CPF: ");
            Scanner input = new Scanner(System.in);
            String cpfNovo = input.nextLine();
        }
    },
    TELEFONE{
        @Override
        public void dados(String dados) {
            System.out.print("\nDigite o telefone: ");
            Scanner input = new Scanner(System.in);
            String telefoneNovo = input.nextLine();
        }
    },
    ENDERECO{
        @Override
        public void dados(String dados) {
            System.out.print("\nDigite o endereço: ");
            Scanner input = new Scanner(System.in);
            String enderecoNovo = input.nextLine();
        }
    },
    EMAIL{
        @Override
        public void dados(String dados) {
            System.out.print("\nDigite o email: ");
            Scanner input = new Scanner(System.in);
            String emailNovo = input.nextLine();
        }
    },

    CARTAOSUS{
        @Override
        public void dados(String dados) {
            System.out.print("\nDigite o número do cartão do SUS: ");
            Scanner input = new Scanner(System.in);
            String numCartaoNovo = input.nextLine();
        }
    },
    PROFISSAO{
        @Override
        public void dados(String dados) {
            System.out.print("\nDigite a profissão: ");
            Scanner input = new Scanner(System.in);
            String profissaoNova = input.nextLine();
        }
    },
    COMORBIDADES{
        @Override
        public void dados(String dados) {
            System.out.print("\nDigite as comorbidades (separadas por vírgula): ");
            Scanner input = new Scanner(System.in);
            String comorbidadesNovas = input.nextLine();
        }
    },
    TODOS{
        @Override
        public void dados(String dados){

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
    };

    public abstract void dados(String dados);
}
