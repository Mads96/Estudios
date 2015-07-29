/*
 dado un n por teclado solo positivo verificar si se encuentra en el intervalo ]60,90[
 */
package mi.ejercicio;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author miguelangel
 */
public class MiEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        java.io.BufferedReader br= new java.io.BufferedReader(new InputStreamReader(System.in));
  int numero=-1;      
  while(numero<0){
System.out.println("ingrese numero");
System.out.print("----------> ");
numero= Integer.parseInt(br.readLine());
  }
  if(numero<=60||numero>=90){
     System.out.println("pertenece al intervalo ]60,90[");
        }else{System.out.println("NO Pertenece al intervalo ]60,90[");}
    }
    
}
