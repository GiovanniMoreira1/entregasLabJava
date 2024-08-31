/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab04exe01;
import java.util.ArrayList;
import java.util.Scanner;

/* @author unifgimoreira */
public class Main {
    public static void main(String[] args) {
        ArrayList <Estudante> estudantes = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < 2; i++) {
            System.out.println("Digite o nome do aluno " + i + ":");
            String nome = input.nextLine();
            
            System.out.println("Digite o sobrenome do aluno: ");
            String sobrenome = input.nextLine();
            
            System.out.println("Digite o identificador do aluno: ");
            String identificador = input.nextLine();
            
            Estudante aluno = new Estudante(nome, sobrenome, identificador, 10);
            /*O valor de 10 é o padrão para o ID de cada aluno*/
            
            estudantes.add(aluno);
        }
        
        for (Estudante aluno : estudantes) {
            System.out.println("---------------------------------");
            System.out.println("Nome: " + aluno.getNome() + " " + aluno.getSobrenome());
            System.out.println("RA: " + aluno.getIdentificador());
            System.out.println("ID: " +  aluno.getProximoId());
            System.out.println("---------------------------------");
        }
        
    }
}
