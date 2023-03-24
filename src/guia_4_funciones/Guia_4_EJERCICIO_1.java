/* GUIA 4 - FUNCIONES- EJERCICIO_1(UNO)
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
        String salir;
        int a,b,operacion;
         Scanner leer = new Scanner(System.in);
         do{
         System.out.println("Ingrese un Numero:");
         a=leer.nextInt();
         System.out.println("Ingrese un Numero:");
         b=leer.nextInt();
         System.out.println("Realizar la operacion:");
         System.out.println("1-suma..2-resta.. 3-multiplicacion..4- division:");

         operacion=leer.nextInt();
         
         switch(operacion){
             case 1: System.out.println("La suma es:"+suma(a,b)); break;
             case 2: System.out.println("La resta es:"+resta(a,b)); break;
             case 3: System.out.println("La multiplicacion es:"+multiplicacion(a,b)); break;
             case 4: System.out.println("La division es:"+dividir(a,b)); break;
             default:  System.out.println(" opcion Incorrecta..");
         }
       
         System.out.print("Desea Salir(SI/NO):");
         salir=leer.next();
         }while(salir=="SI"); 
         
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
