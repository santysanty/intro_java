/*
 *Realizar un programa que pida dos números enteros positivos por teclado y 
*muestre por pantalla el siguiente menú:El usuario deberá elegir una opción 
*y el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
*El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta 
*que, si el usuario selecciona la opción 5, en vez de salir del programa 
*directamente, se debe mostrar el siguiente mensaje de confirmación: 
*¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona 
*el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar
*el menú.
 */
package Guia_3_unidad_1;

import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Guia_3_EJERCICIO_6 {
 
     public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
       int  numero1,numero2;
       int opcion;
       String salir="";
        do{
          System.out.println("Ingrese un numero");
          numero1=leer.nextInt();
          System.out.println("Ingrese otro numero");
          numero2=leer.nextInt();
        System.out.println("MENU para elegir la operacion:");
        System.out.println("1-Suma ");
        System.out.println("2-Resta");
        System.out.println("3-multiplicar");
        System.out.println("4- dividir");
        System.out.println("5- Salir");
        opcion= leer.nextInt();// carga el valor de la opcion
        
         switch(opcion){
          case 1:  System.out.println("La suma es: "+(numero1+numero2));break;
          case 2:  System.out.println("La resta es: "+(numero1-numero2));break;
          case 3:  System.out.println("La Multiplicación: "+(numero1*numero2));break;   
          case 4:  System.out.println("La división es: "+(numero1/numero2));break;
          case 5: System.out.print("Está seguro que desea salir (S/N)?: ");
                        salir = leer.next(); break;
          default:System.out.print("Opcion Incorrecta ");
         }
         
        }while( !salir.equalsIgnoreCase("S"));
      
    	
       
        }
}