import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        exibeMenu();
    }

    public static void exibeMenu(){
        Controller controller = new Controller();
        Scanner input = new Scanner(System.in);
        String menu = "\n(C)adastrar pessoa\n"
                + "(A)lterar todos os dados da pessoa\n"
                + "(M)udar um dado da pessoa \n"
                + "(E)xibir pessoa \n"
                + "(I)mprimir pessoas na situação: \n"
                + "(S)air\n"
                + "Digite uma opção> ";


        String opcao;
        while(true){
            System.out.println(menu);
            opcao = input.nextLine().toUpperCase();
            if (opcao.equals("S")){
                break;
            }
            try {
                OpcoesMenu opcoes = OpcoesMenu.valueOf(opcao);
                opcoes.opcao(controller, opcao);
            } catch(IllegalArgumentException e){
                System.out.println(String.format("Não há a opção %s! Tente novamente...", opcao));
            }
        }
    }
}
