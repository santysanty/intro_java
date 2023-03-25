/*
 * Crea una aplicación que a través de una función nos convierta una cantidad 
 * de euros introducida por teclado a otra moneda, estas pueden ser a dólares,
 *yenes o libras. La función tendrá como parámetros, la cantidad de euros y
 *la moneda a convertir que será una cadena, este no devolverá ningún valor y
 *mostrará un mensaje indicando el cambio (void).
 * El cambio de divisas es:
  * 0.86 libras es un 1 €
  * 1.28611 $ es un 1 €
  *129.852 yenes es un 1 €

 */
package guia_4_funciones;
import static guia_4_funciones.Guia_4_EJERCICIO_2.registro;
import java.util.Scanner;
/**
 *
 * @author Daniel Coria
 */
public class Guia_4_EJERCICIO_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double monedaEuro;
        String elegirMoneda;
        String salir;
        Scanner leer = new Scanner(System.in);
        do{
        
         System.out.println("Ingrese la cantidad en Euros:");
         monedaEuro= leer.nextInt();
         System.out.println("Elegir la moneda a convertir: (dolar -Yen- Libras):");
         elegirMoneda= leer.next();
         convertirMoneda(monedaEuro,elegirMoneda);
         System.out.println("Desea seguir convertiendo a otra moneda:Salir(NO) :");
         salir= leer.next();
        }while(!salir.equalsIgnoreCase("NO"));
            
        
    }
    
    public static void convertirMoneda(double moneda,String elegirMoneda){
    
      switch(elegirMoneda){
          case "dolar":  System.out.println(" Cambio divisa de Euros a Dolares:"+moneda*1.28611); break;
          case "yanes":  System.out.println(" Cambio divisa de Euros a Yanes:"+moneda*129.852); break;
          case "libra": System.out.println(" Cambio divisa de Euros a Libras:"+moneda*0.86);  break;
          default:
                    System.out.println("La opcion para convertir a otra moneda es Invalido.");
              
      }
     
    }
}
