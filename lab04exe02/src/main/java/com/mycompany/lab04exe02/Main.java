/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab04exe02;

/* @author unifgimoreira */
public class Main {
    public static void main(String[] args) {
        System.out.println("Maior: " + Matematica.max3(1, 2, 3));
       
        System.out.println("Método impar - Boolean retornado: " + Matematica.impar(true, false, true));
        System.out.println("Método impar - Boolean retornado: " + Matematica.impar(true, false, false));
        
        System.out.println("Método maioria - Boolean retornado " + Matematica.maioria(false, true, false));
        System.out.println("Método maioria - Boolean retornado " + Matematica.maioria(true, true, false));
        System.out.println("Método maioria - Boolean retornado " + Matematica.maioria(true, true, true));
    }
}
