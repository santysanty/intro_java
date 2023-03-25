/*
  * Escriba un programa que pida una frase o palabra y valide si la primera 
*letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá
*de imprimir un mensaje por pantalla que diga “CORRECTA”, en caso contrario, 
*se deberá imprimir “INCORRECTA”. Nota: investigar la función Substring 
*y equals() de Java.
 */
package Guia_3_unidad_1;

import java.util.Scanner;
/**
 *
 * @author Daniel Coria
 */
public class Guia_3_EJERCICIO_4 {
    
     public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String frase, primerLetra ;
        System.out.println("Ingrese una frase para verificar si la primera letra es A:");
    	frase= leer.nextLine();
        primerLetra=frase.substring(0, 1);// permite obtner la primera posicion de letra de la frase.
        // example de internet --String first = str.substring(0, 1);
        if( primerLetra.equalsIgnoreCase ("A")){ 
        System.out.println("La frase es correcta");
        }else{
        System.out.println("La frase es Incorrecta");
        }
  }
    
}
