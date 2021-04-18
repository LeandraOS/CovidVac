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
        while (true) {
            imprimeMenu();
            String opcao = input.nextLine().toUpperCase();
            if (opcao.equals("S")) {
                break;
            }
            try { //uso do padrão strategy. Utilizo enums para reduzir a quantidade de condicionais no menu.
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
                + "(EX)ibir etapa de vacinação do paciente \n"
                + "(S)air\n"
                + "Digite uma opção> \n";
        System.out.println(menu);
    }
}
