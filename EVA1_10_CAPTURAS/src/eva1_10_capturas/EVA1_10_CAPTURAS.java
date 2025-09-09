/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_capturas;

import java.util.Scanner;

/**
 *
 * @author javier
 */
public class EVA1_10_CAPTURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //VELOCIDAD = DISTANCIA / TIEMPO
       //M / S
       double velocidad;
       double distancia;
       double tiempo;
       
       Scanner captu = new Scanner(System.in);
       
       System.out.println; ("introduce la distancia");
       distancia = captu.nextDouble();
       System.out.println; ("introduce el tiempo");
       tiempo = captu.nextDouble();
       velocidad = distancia / tiempo;
       System.out.println("la velocidad es");
       System.out.println(velocidad);
       System.out.println("m/s");
    
}
