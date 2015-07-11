/*
 determinar cantidad de digitos de x
 */
package seis;

/**
 *
 * @author ciisa
 */
public class Seis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x=74563;
        int y=0;
        for(int i=x;i>=1;i=i/10){
        y++;
            System.out.println(i);
        }
        System.out.println(y);
    }
    
}
