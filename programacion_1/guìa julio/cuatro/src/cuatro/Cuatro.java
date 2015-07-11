/*
 Escribir un programa en Java que lea un número entero desde teclado y realiza
la suma de los 100 número siguientes, mostrando el resultado en pantalla.
 */
package cuatro;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ciisa
 */
public class Cuatro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
     java.io.BufferedReader br= new java.io.BufferedReader(new InputStreamReader(System.in));
        System.out.println("dame un numero");  
     int x= Integer.parseInt(br.readLine());
     int y=1;
     for(int i=x;i<=100;i++){
         
         System.out.println(y+"+"+i+"="+(y+i));
         y=y+i;
     }
        System.out.println("resultado"+y);
    }
    
}
