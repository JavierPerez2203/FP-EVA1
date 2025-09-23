/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_19_antro;

import java.util.Scanner;


public class EVA1_19_ANTRO {

    
    public static void main(String[] args) {
    Scanner captu = new Scanner(System.in);
    int edad;
    boolean credencial;
    System.out.println("captura tu edad");
    edad = captu.nextInt();
    System.out.println("tienes credencial para votar (true/false");
    credencial = captu.nextBoolean();
    
    if ((edad >= 18) && (credencial == true)){
        System.out.println("puedes entrar");
         }else{
        System.out.println("No puedes entrar");
    }
    
    
    }
    
}
