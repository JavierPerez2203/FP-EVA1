/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_if;

import java.util.Scanner;

/**
 *
 * @author javier
 */
public class EVA1_12_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int CALIFA;
     Scanner captu = new Scanner(System.in);

        System.out.println("INTRODUCE LA CALIFICACION");
        CALIFA = captu.nextInt();
        if(CALIFA >= 70) {
            System.out.println("ACREDITASTE LA MATERIA");
            }else{
            System.out.println("NO ACREDITASTE LA MATERIA");
           
        }
        
    }
    
}
