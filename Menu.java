package exercicio_hashtable;

import java.util.Scanner;

public class Menu {
    int opcao;
    String nome;
    String nomeProcurado;
    int telefone;

    Scanner scan = new Scanner(System.in);
    Scanner scan2 = new Scanner(System.in);

    public int gerarMenu() {
        System.out.println("\n-----------------------\n");
        System.out.println("Tela de Lista Telefônica com Hashtable.\n"
            + "Selecione as opções abaixo: ");
        System.out.println("\n-------------------------\n");
        System.out.println("1 - Cadastrar Usuário na Lista \n"
            + "2 - Buscar Contato na Lista\n" + "3 - Finalizar o sistema\n");
        System.out.print("Opção: ");

        return scan.nextInt();
    }

    public String cadastrarNome() {
        System.out.print("Informe o nome que deseja incluir: ");
        return scan2.nextLine();
    }

    public int cadastrarTelefone() {
        System.out.print("Informe o número de telefone dessa pessoa: ");
        return scan.nextInt();
    }

    public String procurarNome() {
        System.out.print("\nInforme o nome que deseja, para saber o telefone: ");
        return scan2.nextLine();
    }

}
