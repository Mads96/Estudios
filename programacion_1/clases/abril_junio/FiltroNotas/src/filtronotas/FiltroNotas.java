/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filtronotas;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author miguelangel
 */
public class FiltroNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       java.io.BufferedReader br= new java.io.BufferedReader(new InputStreamReader(System.in));
       int a = 0;
       int b = 0;
       for(int i=1;i<=10;i++){
            System.out.println("dame nota "+i);
        int x= Integer.parseInt(br.readLine());
        if (x>=7){
        a++;
        }
        else {b++;}
        }
        System.out.println(">7 ="+a);
        System.out.println("<7 ="+b);
    }
}
    

