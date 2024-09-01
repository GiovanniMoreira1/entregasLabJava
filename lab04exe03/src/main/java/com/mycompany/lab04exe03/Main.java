/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab04exe03;
import java.util.Scanner;
import java.util.ArrayList;

/* @author unifgimoreira */
public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> agenda = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        boolean loop = true;

        while(loop) {
            System.out.println("-------------------------------------");
            System.out.println("n - Criar");
            System.out.println("d - Deletar");
            System.out.println("p - Mostra agenda");
            System.out.println("q - Sair");
            System.out.println("-------------------------------------");
            
            String opcao = input.nextLine();
            
            switch(opcao) {
                case "n" -> {
                    System.out.println("Opção escolhida - Criar Pessoa");
                    System.out.println("Digite o nome da pessoa: ");
                    String nome = input.nextLine();
                    System.out.println("Digite o número do telefone de " + nome);
                    String telefone = input.nextLine();

                    Pessoa pessoa = new Pessoa(nome, telefone);

                    agenda.add(pessoa);
                }
                case "d" -> {
                    System.out.println("Opção escolhida - Deletar Pessoa");
                    System.out.println("Digite o nome da pessoa que será deletada de sua agenda: ");
                    String nome = input.nextLine();

                    for (int i = 0; i < agenda.size(); i++) {
                        Pessoa pessoa = agenda.get(i);
                        if(nome.equals(pessoa.getNome())) {
                            agenda.remove(i);
                            i--;
                        }
                    }
                    System.out.println("Contato removido com sucesso!");
                }
                case "p" -> {
                    System.out.println("Opção escolhida - Mostrar agenda");
                    System.out.println("-----------------------------------");

                    for (Pessoa pessoa : agenda) {
                        System.out.println("Nome: " + pessoa.getNome());
                        System.out.println("Telefone: " + pessoa.getTelefone());
                        System.out.println("ID: " + Pessoa.getId());
                        System.out.println("-----------------------------------");
                    }
                }
                case "q" -> {
                    System.out.println("Opção escolhida - Sair");
                    loop = false;
                }
                default -> System.out.println("Opção inválida - tente novamente");
            }
        }
    }
 
}
