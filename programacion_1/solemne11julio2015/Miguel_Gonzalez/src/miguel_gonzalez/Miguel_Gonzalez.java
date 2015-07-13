/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miguel_gonzalez;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ciisa
 */
public class Miguel_Gonzalez {
public static String nombre;
public static String cod;
public static String fecha;
public static String tipo;
public static double total;
public static int canting;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
    java.io.BufferedReader br= new java.io.BufferedReader(new InputStreamReader(System.in));
    
    final int CL=1;
    final int DOLAR=600;
    final int EURO=800;
    

    
    
    
           System.out.println("Nombre de cliente");  
    nombre= br.readLine();
           System.out.println("Fecha de hoy");  
    fecha= br.readLine();
    int x=0;
    while(x>6||x<1){
        System.out.println("Ingrese una opcion");  
        System.out.println("1. Euros a Pesos");  
        System.out.println("2. Pesos a Euros");  
        System.out.println("3. Dolar a Pesos");  
        System.out.println("4. Pesos a Dolar");  
        System.out.println("5. Dolar a Euros");  
        System.out.println("6. Euros a Dolar"); 
        System.out.println("7. Salir");
    x= Integer.parseInt(br.readLine());
    if(x>7||x<1){System.out.println("escoja una opcion valida");}
    }
      switch (x) {
          case 1:
              cod="AX1";
              tipo="Euro a pesos";
              System.out.println("ingrese cantidad de euros");
              canting= Integer.parseInt(br.readLine());
              total=canting*EURO;
              if(canting>0){
                  
              facturacion();
              }
              System.out.println("cantidad invalida");
              break;
          case 2:
              cod="AX2";
              tipo="Pesos a Euros";
              System.out.println("ingrese cantidad de pesos");
              canting= Integer.parseInt(br.readLine());
              total=canting/EURO;
              if(canting>0){
                  
                  facturacion();
              }
              System.out.println("cantidad invalida");
              break;
          case 3:
              cod="AX3";
              tipo="Dolar a Pesos";
              System.out.println("ingrese cantidad de Dolar");
              canting= Integer.parseInt(br.readLine());
              total=canting*DOLAR;
              if(canting>0){
                                
              facturacion();
              }
              System.out.println("cantidad invalida");
              break;
          case 4:
              cod="AX4";
              tipo="Pesos a Dolar";
              System.out.println("ingrese cantidad de Pesos");
              canting= Integer.parseInt(br.readLine());
              total=canting/DOLAR;
              if(canting>0){
              
              facturacion();
              }
              System.out.println("cantidad invalida");
              break;
          case 5:
              cod="AX5";
              tipo="Dolar a Euro";
              System.out.println("ingrese cantidad de Dolar");
              canting= Integer.parseInt(br.readLine());
              total=(DOLAR/canting)/EURO;
              if(canting>0){
              
              facturacion();
              }
              System.out.println("cantidad invalida");
              break;
              
          case 6:
              cod="AX5";
              tipo="Euro a Dolar";
              System.out.println("ingrese cantidad de Euro");
              canting= Integer.parseInt(br.readLine());
              total=(canting*EURO)/DOLAR;
              
              if(canting>0){        
              facturacion();
              }
              System.out.println("cantidad invalida");
           break;
          case 7:
              break;
               
      }
     
    }
    
     public static void facturacion() throws IOException {
        java.io.BufferedReader br = new java.io.BufferedReader(new InputStreamReader(System.in));
         System.out.println("Nombre Cliente: "+nombre);
         System.out.println("Fecha"+fecha);
         System.out.println("codigo de cambio: "+cod);
         System.out.println("Tipo de cambio: "+tipo);
         System.out.println("Cantidad ingresada: "+ canting);
         System.out.println("Total: "+total);
        

    }

}
