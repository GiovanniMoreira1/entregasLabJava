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
        
        while(true) {
            System.out.println("-------------------------------------");
            System.out.println("n - Criar");
            System.out.println("d - Deletar");
            System.out.println("p - Mostra agenda");
            System.out.println("q - Sair");
            System.out.println("-------------------------------------");
            
            String opcao = input.nextLine();
            
            switch(opcao) {
                case "n" -> System.out.println("Opção escolhida - Criar Pessoa"); 
                case "d" -> System.out.println("Opção escolhida - Deletar Pessoa");
                case "p" -> System.out.println("Opção escolhida - Mostrar agenda");
                case "q" -> System.out.println("Opção escolhida - Sair");
                default -> System.out.println("Opção inválida - tente novamente");
            }
        }
    }
 
}
