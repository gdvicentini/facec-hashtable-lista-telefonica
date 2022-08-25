package exercicio_hashtable;

import java.util.Hashtable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao = 0;
        String nome;
        String nomeProcurado;
        int telefone;

        Hashtable<String, Integer> produtos = new Hashtable<String, Integer>();

        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        while (opcao != 3) {
            System.out.println("\n-----------------------\n");
            System.out.println("Tela de Lista Telefônica com Hashtable.\n"
            + "Selecione as opções abaixo: ");
            System.out.println("\n-------------------------\n");
            System.out.println("1 - Cadastrar Usuário na Lista \n"
            + "2 - Buscar Contato na Lista\n" + "3 - Finalizar o sistema\n");
            System.out.print("Opção: ");
            opcao = scan.nextInt();

            switch(opcao) {
                case 1:
                    System.out.print("Informe o nome que deseja incluir: ");
                    nome = scan2.nextLine();
                    System.out.print("Informe o número de telefone dessa pessoa: ");
                    telefone = scan.nextInt();

                    produtos.put(nome, telefone);
                    break;

                case 2:
                    System.out.print("\nInforme o nome que deseja, para saber o telefone: ");
                    nomeProcurado = scan2.nextLine();

                    if(produtos.get(nomeProcurado) != null) {
                        System.out.println(produtos.get(nomeProcurado));
                        break;
                    } else {
                        System.out.println("\nNome procurado não existe na lista");
                        break;
                    }  

                case 3:
                    System.out.println("\nFinalizando o sistema...");
                    break;
                default:
                    System.out.println("\nOpção Inválida");
            }
        }
        
    }
}
