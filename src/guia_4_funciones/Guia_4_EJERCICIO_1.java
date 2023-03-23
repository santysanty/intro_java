/* GUIA 4 - FUNCIONES
 * Crea una aplicación que le pida dos números al usuario y este pueda elegir 
 *entre sumar, restar, multiplicar y dividir. La aplicación debe tener una
 *función para cada operación matemática y deben devolver sus resultados para 
 * imprimirlos en el main
 */
package guia_4_funciones;
import java.util.Scanner;
/**
 *
 * @author Daniel Coria
 */
public class Guia_4_EJERCICIO_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1,num2;
         Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese un Numero:");
         num1=leer.nextInt();
         System.out.println("Ingrese un Numero:");
         num2=leer.nextInt();
         
         
         
    }
    public static int suma(int a,int b){
        int resultado=a+b;
     return resultado;
    }
     public static int resta(int a,int b){
        int resultado=a-b;
     return resultado;
     }
    public static int multiplicacion(int a,int b){
        int resultado=a*b;
     return resultado;
     }
    public static int dividir(int a,int b){
        int resultado=a/b;
     return resultado;
     }
}
