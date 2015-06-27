/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma10valoresin;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author miguelangel
 */
public class Suma10ValoresIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       java.io.BufferedReader br= new java.io.BufferedReader(new InputStreamReader(System.in));
        int y=0;
        for(int i=1;i<=10;i++){
            System.out.println("dame un numero "+i);
        int x= Integer.parseInt(br.readLine());
        y=x+y;
        }
        System.out.println("resultado= "+y);
    }
    
}
