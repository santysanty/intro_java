/*
 *.Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
 *este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas 
 *deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres 
 * de largo, el primer carácter tiene que ser X y el último tiene que ser una O.

 *Las secuencias leídas que respeten el formato se consideran correctas,
 *la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), 
 *y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta

 * Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas 
  *correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar
 *cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals(). 
 */
package Guia_3_unidad_1;

import java.util.Scanner;
/**
 *
 * @author Daniel Coria
 */
public class Guia_3_EJERCICIO_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String cadenaEnviada="", letraX="",letraO="";
       int longitudCadena, correctas=0,incorrectas=0, suma;
       System.out.println("simule el funcionamiento de un dispositivo RS232:");
       do{
        System.out.println("envie la cadena de texto enviada por el dispositivo:");
        cadenaEnviada=leer.nextLine();
        longitudCadena = cadenaEnviada.length();// se optiene la logitud de la cadena
        letraX=cadenaEnviada.substring(0,1);//se optiene el primer caracter de la cadena
        letraO=cadenaEnviada.substring(0,longitudCadena-1);
        // se optiene el ultimo caracter de la cadena.
        if(longitudCadena==5 && letraX.equals("X") && letraO.equals("O") ){
            // compara si la logitud de cadena es 5 y si obtuvo la letra X o O
         correctas=correctas+1;
        }else if(!cadenaEnviada.equalsIgnoreCase("&&&&&")){
         incorrectas=incorrectas+1;
        }
        
        
       }while(!cadenaEnviada.equalsIgnoreCase("&&&&&"));
       // verifica si la cadena tiene 5 simbolos &&&&&
        
         System.out.println("Cantidad de cadena correctas:"+correctas);
          System.out.println("Cantidad de cadena Incorrectas:"+ incorrectas);
    }
    
}

