
package eva1_9_captura;

import java.util.Scanner;

public class EVA1_9_CAPTURA {

    
    public static void main(String[] args) {
        
        String nombre;
        int edad;
        double promedio;
        Scanner input = new Scanner(System.in);// crea el scanner
        
        System.out.println("Introduce tu nombre completo:");
        //CAPTURA DE DATOS:
        nombre = input.nextLine();//CAPTURA TEXTO (nexLine())
        System.out.println("introduce tu edad");
        edad = input.nextInt();
        System.out.println("captura tu promedio de la preparatoria");
        promedio = input.nextDouble();
        
        System.out.print("El nombre es:");
        System.out.println(nombre);
        System.out.print("la edad es:");
        System.out.println(edad);
        System.out.print("El promedio es:");
        System.out.println(promedio);
    }
    
}
