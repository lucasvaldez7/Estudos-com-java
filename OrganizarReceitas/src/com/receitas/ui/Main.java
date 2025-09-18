package com.receitas.ui;

import com.receitas.model.Receita;
import com.receitas.service.OrganizadorDeReceitas;
import com.receitas.model.Ingrediente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OrganizadorDeReceitas organizador = new OrganizadorDeReceitas();

        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\n--- Menu de Receitas ---");
            System.out.println("1. Adicionar nova receita");
            System.out.println("2. Remover receita");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                opcao = 0; // Atribuindo um valor inválido para o loop não travar
                scanner.nextLine();
            }

            switch (opcao) {
                case 1:
                    // Adicionando nova receita
                    System.out.print("Digite o nome da receita: ");
                    String nomeReceita = scanner.nextLine();
                    System.out.print("Digite o modo de preparo: ");
                    String modoPreparo = scanner.nextLine();

                    List<Ingrediente> ingredientes = new ArrayList<>();
                    String adicionarMais;
                    do {
                        System.out.print("Digite o nome do ingrediente: ");
                        String nomeIngrediente = scanner.nextLine();
                        System.out.print("Digite a quantidade: ");
                        double quantidade = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.print("Digite a unidade (ex: g, ml, xícara): ");
                        String unidade = scanner.nextLine();

                        Ingrediente ingrediente = new Ingrediente(nomeIngrediente, quantidade, unidade);
                        ingredientes.add(ingrediente);

                        System.out.print("Adicionar outro ingrediente? (s/n): ");
                        adicionarMais = scanner.nextLine();
                    } while (adicionarMais.equalsIgnoreCase("s"));

                    Receita novaReceita = new Receita(nomeReceita, modoPreparo, ingredientes);
                    organizador.adicionarReceita(novaReceita);
                    System.out.println("Receita adicionada com sucesso!");
                    break;

                case 2:
                    // Remover receita
                    System.out.println("\n--- Remover Receita ---");
                    System.out.print("Digite o nome da receita para remover: ");
                    String nomeParaRemover = scanner.nextLine();
                    organizador.removerReceita(nomeParaRemover);
                    break;

                case 3:
                    // Sair do programa
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
                    break;
            }
        } while (opcao != 3);

        scanner.close();

    }

}