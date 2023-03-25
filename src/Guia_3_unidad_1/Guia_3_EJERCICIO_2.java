/*
 *C*rear un programa que pida una frase y si esa frase es igual a “eureka” 
 * *el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de 
 * *Incorrecto
 */
package Guia_3_unidad_1;

import java.util.Scanner;
/**
 
 * @author Daniel Coria
 */
public class Guia_3_EJERCICIO_2 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        String frase ;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
    	frase= leer.nextLine();
        if( frase.equalsIgnoreCase("eureka")){ 
            // La funcion equalsIgnoreCase se utiliza para comparar la 
            // cadena de frase con la palabra " eureka"
                    
        System.out.println("La frase es correcta");
        }else{
        System.out.println("La frase es Incorrecta");
        }
  }
}
