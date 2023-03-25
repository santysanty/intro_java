/*
 *Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y
 *se muestre su equivalente en romano.
 */
package Guia_3_Ejercicios_extras;

import java.util.Scanner;

/**
 *
 * @author Daniel Coria
 */
public class Guia_3_EJERCICIOS_EXTRAS_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int numeroDecimal;
        String numeroRomano;
      
        System.out.print("Ingrese una letra entre 1 y 10:");
    	numeroDecimal= leer.nextInt();
        switch(numeroDecimal){
            case 1: numeroRomano="I";break;
            case 2: numeroRomano="II";break;
            case 3: numeroRomano="III";break;
            case 4: numeroRomano="IV";break;
            case 5: numeroRomano="V";break;
            case 6: numeroRomano="VI";break;
            case 7: numeroRomano="VII";break;
            case 8: numeroRomano="VIII";break;
            case 9: numeroRomano="IX";break;
            case 10: numeroRomano="X";break;
            default: numeroRomano="Invalido NO esta entre los 10 numeros romanos.";
        }
        System.out.println("EL numero romano es ?:"+numeroRomano);
    }
    
}
