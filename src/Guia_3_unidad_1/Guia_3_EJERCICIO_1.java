/*
 * Crear un programa que dado un número determine si es par o impar
 */
package Guia_3_unidad_1;

import java.util.Scanner;

/**
 *
 * @author Daniel Coria
 */
public class Guia_3_EJERCICIO_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero ;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
    	numero= leer.nextInt();
        if( numero % 2==0){ // Primero se saca el resto de una division y luego
            // ese resultado se compara con el cero--// si cumple la condicion
            // entra en el if- y envia el siguiente mensaje de salida. que esta
            // a continuacion, en la sigueinte linea. sino pasa la linea del else            
        System.out.println("El numero es PAR");
        }else{
        System.out.println("El numero es IMPAR");
        }
    }
    
}
