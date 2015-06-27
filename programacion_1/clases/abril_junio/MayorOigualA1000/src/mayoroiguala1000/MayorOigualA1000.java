/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayoroiguala1000;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author miguelangel
 */
public class MayorOigualA1000 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
    java.io.BufferedReader br = new java.io.BufferedReader(new InputStreamReader(System.in));
    
        System.out.println("cantidad");
    int n = Integer.parseInt(br.readLine());
    int a=0;
    int b=0;
    for(int i=1;i<=n;i++){
        System.out.println("dame un numero "+i);
    int x = Integer.parseInt(br.readLine());
    
    if(x<1000){
    a++;
    }
    else{
    b++;
    }
    }
        System.out.println("<100 ="+a);
        System.out.println(">100 ="+b);
    }
    
}
