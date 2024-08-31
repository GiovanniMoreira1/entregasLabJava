/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab04exe01;

/**
 *
 * @author unifgimoreira
 */
public class Estudante {
    private String nome, sobrenome, identificador;
    private static int proximoId = 0;
    
    public Estudante(String nome, String sobrenome, String identificador, int proximoId) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.identificador = identificador;
        this.proximoId = proximoId;
    }
    
    public Estudante() {
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public int getProximoId() {
        return proximoId;
    }

    public void setProximoId(int proximoId) {
        this.proximoId = proximoId;
    }
    
    
}
