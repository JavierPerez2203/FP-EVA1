/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_18_acceso;

import java.util.Scanner;


public class EVA1_18_ACCESO {
  final static String USUARIO = "JAVIER";
  final static String PWD = "1234";

   
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String USU, CONTRA;
    System.out.println("******BIENVENIDO******");
    System.out.println("SISTEMA DE VENTA RESTAURANTE");
    System.out.println("USUARIO");
    USU = input.nextLine();
    System.out.println("contraseña");
    CONTRA = input.nextLine();
    
    
        if(CONTRA.equals(PWD)){
            System.out.println("ACCESO CONCEDIDO!");
            }else{
            System.out.println("ACCESO DENEGADO!");
             if (USU.equals(USUARIO)){
            }else{
            System.out.println("ACCESO DENEGADO!");
            
        }
      
    }
    
    }
    
}
