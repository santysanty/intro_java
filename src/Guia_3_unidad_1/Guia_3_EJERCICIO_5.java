/*
 ** Escriba un programa en el cual se ingrese un valor límite positivo, y a 
 *continuación solicite números al usuario hasta que la suma de los números 
*introducidos supere el límite inicial
 */
package Guia_3_unidad_1;

import java.util.Scanner;
/**
 *
 * @author Daniel Coria
 */
public class Guia_3_EJERCICIO_5 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
       int numeroPositivo, numeroSiguiente, suma;
        System.out.println("Ingrese un numero positivo");
    	numeroPositivo= leer.nextInt();
         suma=0;
        while(suma< numeroPositivo ){ 
         System.out.println("Ingrese un numero para sumar. hasta que supere el valor inicial.");
         numeroSiguiente=leer.nextInt();
         suma=suma+numeroSiguiente;
        }
         System.out.println("La suma es :"+suma);
  }
}
