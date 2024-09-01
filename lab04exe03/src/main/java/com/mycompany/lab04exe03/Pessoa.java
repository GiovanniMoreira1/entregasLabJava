/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab04exe03;

/* @author unifgimoreira */

public class Pessoa {
    private String nome, telefone;
    private static int id = 0;
    
    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }
    
    public Pessoa() {
    }

    public String getTelefone() {
        return telefone;
    }

    public String getNome() {
        return nome;
    }

    public static int getId() {
        return id++;
    }
}
