import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        exibeMenu();
    }

    public static void exibeMenu(){
        Cadastro cadastro = new Cadastro();
        Scanner input = new Scanner(System.in);
        String menu = "\n(C)adastrar pessoa\n"
                + "(A)lterar dados da pessoa\n"
                + "(E)xibir pessoa \n"
                + "(I)mprimir pessoas na situação: \n"
                + "(S)air\n"
                + "Digite uma opção> ";

        String opcao;
        while(true){
            opcao = input.nextLine().toUpperCase();
            try {
                Opcoes opcoes = Opcoes.valueOf(opcao);
                opcoes.opcao(opcao);
            } catch(IllegalArgumentException e){
                System.out.println(String.format("Não há a opção %s! Tente novamente...", opcao));
            }
        }
    }
}
