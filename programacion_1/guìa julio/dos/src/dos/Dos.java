/*
 Escribir un programa en Java que multiplique los 20 primeros número naturales(1*2*3*4*5…).
 */
package dos;

/**
 *
 * @author ciisa
 */
public class Dos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long x=1;
        for(int i=1;i<=20;i++){
            System.out.println(x+"*"+i+"="+(x*i));
            x=x*i;
        }
    }
    
}
