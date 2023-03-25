/*
 *Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor 
 *diferente a cada una. A continuación, realizar las instrucciones necesarias
 *para que: B tome el valor de C, C tome el valor de A, A tome el valor de D y D 
 *tome el valor de B. Mostrar los valores iniciales y los valores finales de cada
 *variable. Utilizar sólo una variable auxiliar
 */
package Guia_3_Ejercicios_extras;
import java.util.Scanner;
/**
 *
 * @author Daniel Coria
 */
public class Guia_3_EJERCICIOS_EXTRAS_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
        int A,B,C,D,AUX;
        A=10;
        B=11;
        C=12;
        D=13;
        System.out.println(" La variable A contiene el valor:"+A);
        System.out.println(" La variable B contiene el valor:"+B);
        System.out.println(" La variable C contiene el valor:"+C);
        System.out.println(" La variable D contiene el valor:"+D);
        AUX=B;
        B=C;
        C=A;
        A=D;
        D=AUX;
        System.out.println(" B: "+B+ " toma el valor de C: ");
        System.out.println(" C: "+C+ " toma el valor de A: ");
        System.out.println(" A: "+A+ " toma el valor de D: ");
        System.out.println(" D: "+D+ " tome el valor de B: ");
               
    }
    
}
