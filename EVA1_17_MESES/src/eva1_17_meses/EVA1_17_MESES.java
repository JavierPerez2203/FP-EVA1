/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_17_meses;

import java.util.Scanner;


public class EVA1_17_MESES {

    
    public static void main(String[] args) {
       System.out.print("Escribe el numero del mes de enero a diciembre (1 al 12): ");
        int MESES;
        Scanner captu = new Scanner(System.in);
        System.out.println("captura el numero del dia (1 al 12");
        MESES = captu.nextInt();
        if (MESES == 1) {
            System.out.println("ENERO");
        }else if (MESES == 2) {
              System.out.println("MARZO");
        }else if (MESES == 3) {
              System.out.println("ABRIL");
        }else if (MESES == 4) {
              System.out.println("MAYO");
        }else if (MESES == 5) {
              System.out.println("JUNIO");
        }else if (MESES == 6) {
              System.out.println("JULIO");
        }else if (MESES == 7) {
              System.out.println("AGOSTO");
        }else if (MESES == 8) {
            System.out.println("SEPTIEMBRE");
            }else if (MESES == 9) {
              System.out.println("OCTUBRE");
        }else if (MESES == 10) {
              System.out.println("NOVIEMBRE");
        }else if (MESES == 11) {
              System.out.println("DICIEMBRE");
        }else if (MESES == 12) {
             }else{ //opcional
            System.out.println("MES NO VALIDO");
            }
    }
    
}
