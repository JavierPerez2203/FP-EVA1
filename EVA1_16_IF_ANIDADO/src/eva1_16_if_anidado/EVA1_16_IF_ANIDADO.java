/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_16_if_anidado;

import java.util.Scanner;


public class EVA1_16_IF_ANIDADO {

    public static void main(String[] args) {
      
         

        // Pide al usuario que introduzca el número del día
        System.out.print("Escribe el numero del dia de la semana que quieres ver (1 para Lunes, 7 para Domingo): ");
        int dia;
        Scanner captu = new Scanner(System.in);
        System.out.println("captura el numero del dia (1 al 7");
        dia = captu.nextInt();
        if (dia == 1) {
            System.out.println("domingo");
        }else if (dia == 2) {
              System.out.println("lunes");
        }else if (dia == 3) {
              System.out.println("martes");
        }else if (dia == 4) {
              System.out.println("miercoles");
        }else if (dia == 5) {
              System.out.println("jueves");
        }else if (dia == 6) {
              System.out.println("viernes");
        }else if (dia == 7) {
              System.out.println("sabado");
        }else if (dia == 8) {
             }else{ //opcional
            System.out.println("numero no valido");
            
        }
       
    }
    
}
