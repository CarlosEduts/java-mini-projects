package projects.student_management.view;

public class Menu {
    public void initialMenu() {
        System.out.println("\n+--- Sistema de Gerenciamento de Estudantes ---+");
        System.out.println("1 - Adicionar estudante");
        System.out.println("2 - Listar estudantes");
        System.out.println("3 - Procurar estudante por email");
        System.out.println("4 - Procurar estudante por nome");
        System.out.println("5 - Atualizar estudante");
        System.out.println("6 - Remover estudante");
        System.out.println("0 - Sair");
        System.out.println("+--- -------------------------------------- ---+\n");

        System.out.print("Escolha: ");
    }

    public void selectedAction(int action) {
        System.out.println();

        if (action == 1) {
            System.out.println("+--- Adicionar estudante ---+");

        } else if (action == 2) {
            System.out.println("+--- Listar estudantes ---+");

        } else if (action == 3) {
            System.out.println("+--- Procurar estudante por email ---+");

        } else if (action == 4) {
            System.out.println("+--- Procurar estudante por nome ---+");

        } else if (action == 5) {
            System.out.println("+--- Atualizar estudante ---+");

        } else if (action == 6) {
            System.out.println("+--- Remover estudante ---+");

        } else {
            System.out.println("+--- Sair ---+");
        }
    }
}
