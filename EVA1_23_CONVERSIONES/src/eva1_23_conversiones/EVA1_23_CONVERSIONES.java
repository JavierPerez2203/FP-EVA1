/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_23_conversiones;

public class EVA1_23_CONVERSIONES {

    public static void main(String[] args) {
     int temp;
     double tempDecimal;
     tempDecimal = 24.5;
     temp = (int)tempDecimal;
     System.out.println(temp);
     
     String cade, mensaje;
     mensaje = "la temperatura es ";
     cade = mensaje + temp;//concatenacion
     System.out.println(cade);
    }
    
}
