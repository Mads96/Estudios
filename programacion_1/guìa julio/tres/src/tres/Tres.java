/*
 Escribir un programa en Java que sume los cuadrados de los cien primeros
números naturales, mostrando el resultado en pantalla.

 */
package tres;

/**
 *
 * @author ciisa
 */
public class Tres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x=0;
        for(int i=1;i<=100;i++){
            x=x+(i*i);
            System.out.println(i+" x="+x);
        }
        System.out.println(x);
    }
    
}
