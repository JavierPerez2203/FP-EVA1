/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_if;

import java.util.Scanner;

/**
 *
 * @author javier
 */
public class EVA1_13_IF {

    
    public static void main(String[] args) {
     int VENTA; //VENTA DE ALCOHOL.
     Scanner captu = new Scanner(System.in);

        System.out.println("INTRODUCE TU AÑO DE NACIMIENTO");
        VENTA  = captu.nextInt();
        if(VENTA >= 2007) {
            System.out.println("SI SE LE VENDE ALCOHOL");
            }else{
            System.out.println("NO SE LE VENDE ALCOHOL");
            
           } 
    }
    
}
