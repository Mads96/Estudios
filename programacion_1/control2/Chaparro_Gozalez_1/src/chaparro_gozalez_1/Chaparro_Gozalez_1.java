/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chaparro_gozalez_1;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author miguelangel
 */
public class Chaparro_Gozalez_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
    java.io.BufferedReader br= new java.io.BufferedReader(new InputStreamReader(System.in));
    System.out.println("ingrese n1");
    double n1= Integer.parseInt(br.readLine());
        System.out.println("n2");
    double n2= Integer.parseInt(br.readLine());
        System.out.println("n3");
    double n3= Integer.parseInt(br.readLine());
        System.out.println("n4");
    double n4= Integer.parseInt(br.readLine());
        System.out.println("n5");
    double n5= Integer.parseInt(br.readLine());
        System.out.println("n6");
    double n6= Integer.parseInt(br.readLine());
        System.out.println("n7");
    double n7= Integer.parseInt(br.readLine());
    
    double suma =(n1+n2+n3+n4+n5+n6+n7);
        System.out.println("suma = "+suma);
    double prom =(suma/7);
        System.out.println("promedio = "+prom);
    double restas = (n1-n2-n3-n4-n5-n6-n7);
    int resta=(int)restas;
        System.out.println("resta = "+resta);
    if(n1==0||n2==0||n3==0||n4==0||n5==0||n6==0||n7==0){
        System.out.println("los valores no deven ser iguales que 0");
    }
    else{
      double div =(n1/n2/n3/n4/n5/n6/n7);
      //int div= (int)divicion;
        System.out.println("divición = "+div);
    }
    }
    
}
