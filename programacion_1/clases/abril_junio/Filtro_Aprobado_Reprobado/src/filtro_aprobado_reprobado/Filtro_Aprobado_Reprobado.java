/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filtro_aprobado_reprobado;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author miguelangel
 */
public class Filtro_Aprobado_Reprobado {

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
        if (x>=4){
        a++;
        }
        else {b++;}
        }
        System.out.println("reprobados = "+b);
    }
    
}
