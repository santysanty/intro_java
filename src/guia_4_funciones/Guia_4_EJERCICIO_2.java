/* GUIA_4_EJERCICIO_2
 * Diseñe una función que pida el nombre y la edad de N personas e imprima 
 *los datos de las personas ingresadas por teclado e indique si son mayores o
 *menores de edad. Después de cada persona, el programa debe preguntarle al 
 *usuario si quiere seguir mostrando personas y frenar cuando el usuario 
 *ingrese la palabra “No”.
 */
package guia_4_funciones;
import java.util.Scanner;
/**
 *
 * @author Daniel Coria
 */
public class Guia_4_EJERCICIO_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
        String  salir,  nombre;
        int edad;
        do{
         System.out.println("Ingrese el nombre :");
         nombre= leer.next();
         System.out.println("Ingrese la edad de la persona:");
         edad= leer.nextInt();
         registro(nombre,edad);
         System.out.println("Desea seguir mostrando loa registros:Salir(NO) :");
         salir= leer.next();
        }while(!salir.equalsIgnoreCase("NO"));
    }
    
    public static int  registro(String nom,int edad){
     int mayorOmenor=0;
     if(edad>18){
      System.out.println("Es mayor de edad:");
     }else{
     System.out.println("Es menor de edad");
     }
     return mayorOmenor;
    }
}
