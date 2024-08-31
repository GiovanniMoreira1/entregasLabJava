/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab04exe02;

/* @author unifgimoreira */

public class Matematica {
   public static int max3(int num1, int num2, int num3) {
      int local;
      if (num1 > num2) {
          local = num1;
      } else {
          local = num2;
      }
      
      if(local < num3) {
          local = num3;
      }
      return local;
   }
   
   public static boolean impar(boolean b1, boolean b2, boolean b3){
       int cont = 0;
        if (b1) {
            cont++;
       }
        if(b2) {
            cont++;
        }
        if(b3) {
            cont++;
        }
        
        return (cont % 2 != 0);
   }
   
   public static boolean maioria(boolean b1, boolean b2, boolean b3) {
       return ((b1 && b2) || (b2 && b3) || (b1 && b3));
   }
}
