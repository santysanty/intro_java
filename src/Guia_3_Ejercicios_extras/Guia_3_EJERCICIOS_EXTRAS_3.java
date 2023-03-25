/*
 *Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata
 *de una vocal. Caso contrario mostrar un mensaje. Nota: investigar la función 
 *equals()o equalsIgnoreCase  de la clase String.
 */
package Guia_3_Ejercicios_extras;
import java.util.Scanner;
/**
 *
 * @author Daniel Coria
 */
public class Guia_3_EJERCICIOS_EXTRAS_3 {

    /**
     * @param args the command line arguments
     *  se utilizo equalsIgnoreCase()  de la clase String en lugar equals().
     * porque convierte todo los caracteres a mayuscula.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String letra;
        boolean esVocal;
        System.out.println("Ingrese una letra");
    	letra= leer.nextLine();
        esVocal=letra.equalsIgnoreCase("A")|| letra.equalsIgnoreCase("E")||
             letra.equalsIgnoreCase("I")|| letra.equalsIgnoreCase("O")||
              letra.equalsIgnoreCase("U");
        if(esVocal ){
            System.out.println("La letra es una vocal");
        }else{
            System.out.println("La letra NO es una vocal");
        }
    }
    
}
