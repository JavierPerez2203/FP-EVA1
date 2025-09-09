/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_operaciones_logicas;

/**
 *
 * @author javier
 */
public class EVA1_11_OPERACIONES_LOGICAS {

    
    public static void main(String[] args) {
        int radio = 5; //declaramos y inicializamos
        boolean resu;
        //operaciones logicas: comparaciones
        //resultados siempre seran verdadero o falso (true or false)
        
        resu = radio > 0; 
        System.out.println("radio (5) > 0");
        System.out.println(resu);
        
        resu = radio < 0;
        System.out.println("radio (5) < 0");
        System.out.println(resu);
        
         resu = radio ==0;
        System.out.println("radio (5) == 0");
        System.out.println(resu);
        
        resu = radio !=0;
        System.out.println("radio (5) != 0");
        System.out.println(resu);
        
        
        
        
    }
    
}
