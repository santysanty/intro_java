/*
 *Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo.
 *Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir 
 * un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá 
 *imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
 */
package Guia_3_unidad_1;

import java.util.Scanner;
/**
 *
 * @author Daniel Coria
 */
public class Guia_3_EJERCICIO_3 {
    
     public static void main(String[] args) {
        // TODO code application logic here
        String frase ;
        int length;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase y verifica si es de 8 caracteres");
    	frase= leer.nextLine();
        // length = frase.length(); // obtengo el tamaño de a cadena
        if( frase.length()==8){ // comparo la cadena con el valor 8 
            // La funcion equalsIgnoreCase se utiliza para comparar la 
            // cadena de frase con la palabra " eureka"
                    
        System.out.println("La frase es correcta");
        }else{
        System.out.println("La frase es Incorrecta");
        }
  }
}
