import model.*;
import service.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            Leitor l = new Leitor();
            LeitorService ls = new LeitorService();

        int opcao;

            do {
                System.out.println("\n=== Sistema de Biblioteca ===");
                System.out.println("1. Cadastrar Leitor");
                System.out.println("2. Consultar Livros");
                System.out.println("3. Realizar Empréstimo");
                System.out.println("4. Consultar Empréstimos");
                System.out.println("5. Listar Leitores");
                System.out.println("0. Sair");
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {


                    case 1 :
                        ls.cadastrarLeitor(l);

                        break;
                   /* case 2 -> consultarLivros();


                    case 3 -> realizarEmprestimo(scanner);



                    case 4 -> consultarEmprestimos();
                    case 5 -> listarLeitores();*/
//                        inicializarLivros();

                  //  case 0 -> System.out.println("Saindo...");
               //     default -> System.out.println("Opção inválida.");
                }
            } while (opcao != 0);

            scanner.close();}
    }

