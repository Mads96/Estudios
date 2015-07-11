/*
 Escribir un programa en Java que lea un número entero por el teclado e imprima
    todos los número impares menores que él.

 */
package cinco;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ciisa
 */
public class Cinco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
         java.io.BufferedReader br= new java.io.BufferedReader(new InputStreamReader(System.in));
        System.out.println("dame un numero");  
     int x= Integer.parseInt(br.readLine());
     for(int i=x;i>=1;i--){
     if(i%2!=0){
         System.out.println(i);
     }
     }
    }
    
}
