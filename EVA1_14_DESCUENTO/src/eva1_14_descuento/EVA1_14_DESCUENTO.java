/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_descuento;

import java.util.Scanner;

/**
 *
 * @author javier
 */
public class EVA1_14_DESCUENTO {

    
    public static void main(String[] args) {
        double montoVenta , montoPagar;
        Scanner captu = new Scanner(System.in);
        System.out.println("monto de compra");
        montoVenta = captu.nextDouble();
        if (montoVenta > 1000){
            montoPagar = montoVenta * 0.85;
            //montoPagar = montoVenta - (montoVenta* 0.15);
             System.out.println("debes pagar");
              System.out.println(montoPagar);
            
        }
    }
    
}
