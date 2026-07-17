package atividades.atividade6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListaTarefasDinamica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Listas simples de texto
        ArrayList<String> listaTarefas = new ArrayList<>();
        ArrayList<String> listaConcluidas = new ArrayList<>();

        System.out.println("Introduza as suas tarefas (digite 'fim' para terminar):");

        // 1. ETAPA DE CADASTRO
        while (true) {
            System.out.print("Tarefa: ");
            String entrada = scanner.nextLine().trim();

            if (entrada.equalsIgnoreCase("fim")) {
                break;
            }

            if (!entrada.isEmpty()) {
                listaTarefas.add(entrada); // Adiciona na lista ativa
            }
        }

        // 2. MENU INTERATIVO DE OPÇÕES
        int opcao = 0;
        while (opcao != 8) {
            System.out.println("\n=== MENU DE OPÇÕES ===");
            System.out.println("1. Mostrar tarefas atuais");
            System.out.println("2. Ordenar em ordem alfabética");
            System.out.println("3. Remover tarefa por nome específico");
            System.out.println("4. Remover por FIFO (Primeira que entrou)");
            System.out.println("5. Remover por LIFO (Última que entrou)");
            System.out.println("6. Remover por FEFO (Menor prazo de dias)");
            System.out.println("7. Ver tarefas concluídas");
            System.out.println("8. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o teclado do Java

            switch (opcao) {
                case 1:
                    System.out.println("\n--- TAREFAS ATUAIS ---");
                    for (int i = 0; i < listaTarefas.size(); i++) {
                        System.out.println((i + 1) + ". " + listaTarefas.get(i));
                    }
                    break;

                case 2:
                    // Ordena a lista de textos de A a Z de forma automática
                    Collections.sort(listaTarefas);
                    System.out.println("Lista ordenada alfabeticamente!");
                    break;

                case 3:
                    System.out.print("Digite o nome exato da tarefa para remover: ");
                    String nomeRemover = scanner.nextLine().trim();

                    if (listaTarefas.contains(nomeRemover)) {
                        listaTarefas.remove(nomeRemover); // Remove da lista ativa
                        listaConcluidas.add(nomeRemover); // Guarda nas concluídas
                        System.out.println("Tarefa concluída com sucesso!");
                    } else {
                        System.out.println("Tarefa não encontrada.");
                    }
                    break;

                case 4:
                    // FIFO: O primeiro elemento está sempre na posição 0
                    if (!listaTarefas.isEmpty()) {
                        String removidaFIFO = listaTarefas.remove(0);
                        listaConcluidas.add(removidaFIFO);
                        System.out.println("Removida (FIFO): " + removidaFIFO);
                    } else {
                        System.out.println("A lista está vazia.");
                    }
                    break;

                case 5:
                    // LIFO: O último elemento está na posição (tamanho da lista - 1)
                    if (!listaTarefas.isEmpty()) {
                        int ultimaPosicao = listaTarefas.size() - 1;
                        String removidaLIFO = listaTarefas.remove(ultimaPosicao);
                        listaConcluidas.add(removidaLIFO);
                        System.out.println("Removida (LIFO): " + removidaLIFO);
                    } else {
                        System.out.println("A lista está vazia.");
                    }
                    break;

                case 6:
                    // FEFO simplificado por dias restantes
                    if (!listaTarefas.isEmpty()) {
                        int menorPrazo = Integer.MAX_VALUE;
                        int indiceMenorPrazo = 0;

                        System.out.println("Defina o prazo de dias para achar a mais urgente:");
                        for (int i = 0; i < listaTarefas.size(); i++) {
                            System.out.print("Quantos dias faltam para a tarefa '" + listaTarefas.get(i) + "'? ");
                            int dias = scanner.nextInt();

                            if (dias < menorPrazo) {
                                menorPrazo = dias;
                                indiceMenorPrazo = i;
                            }
                        }
                        scanner.nextLine(); // Limpa teclado

                        String removidaFEFO = listaTarefas.remove(indiceMenorPrazo);
                        listaConcluidas.add(removidaFEFO);
                        System.out.println("Removida por FEFO (Mais urgente): " + removidaFEFO);
                    } else {
                        System.out.println("A lista está vazia.");
                    }
                    break;

                case 7:
                    System.out.println("\n--- TAREFAS CONCLUÍDAS ---");
                    for (String tarefa : listaConcluidas) {
                        System.out.println("[✔] " + tarefa);
                    }
                    break;

                case 8:
                    System.out.println("Saindo do sistema de tarefas...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}
