/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chaparro_gonzalez_2;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author miguelangel
 */
public class Chaparro_Gonzalez_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        java.io.BufferedReader br= new java.io.BufferedReader(new InputStreamReader(System.in));
    System.out.println("ingrese n");
    int n= Integer.parseInt(br.readLine());
   int t=0;
   int r;
   int p = (n-1);
   r=n;
   
   while(n>=2){
       t=r*p;
       n--;
       p=n-1;
       r=t;
   }
        System.out.println("el resultado es "+ t);
    
    }
    }
    
    

