package Menu;

import Controller.Controller;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        exibeMenu();
    }

    public static void exibeMenu() {
        Controller controller = new Controller();
        Scanner input = new Scanner(System.in);



        String opcao;
        while (true) {
            imprimeMenu();
            opcao = input.nextLine().toUpperCase();
            if (opcao.equals("S")) {
                break;
            }
            try {
                OpcoesMenu opcoes = OpcoesMenu.valueOf(opcao);
                opcoes.opcao(controller, opcao);
            } catch (IllegalArgumentException e) {
            }
        }
    }

    private static void imprimeMenu(){
        String menu = "\n(C)adastrar pessoa\n"
                + "(E)ntrar no sistema \n"
                + "(A)lterar todos os dados da pessoa\n"
                + "(M)udar um dado da pessoa \n"
                + "(EX)ibir pessoa \n"
                + "(S)air\n"
                + "Digite uma opção> \n";
        System.out.println(menu);
    }
}
