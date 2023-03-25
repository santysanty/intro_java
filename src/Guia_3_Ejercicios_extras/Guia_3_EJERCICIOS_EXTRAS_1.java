/*
 *Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo,
 *si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 
 *1 día, 2 horas.
 */
package Guia_3_Ejercicios_extras;
import java.util.Scanner;
/**
 *
 * @author Daniel Coria
 */
public class Guia_3_EJERCICIOS_EXTRAS_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int minuto,dia, hora;
         System.out.print("Ingrese el tiempo en minutos:");
    	 minuto= leer.nextInt();
         hora=minuto*60;
         dia=hora*24;
        System.out.print(" su equivalencia en dia:"+dia);
        System.out.print(" su equivalencia en hora:"+hora);
               
    }
    
}
