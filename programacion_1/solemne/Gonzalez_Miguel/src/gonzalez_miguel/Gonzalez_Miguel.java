
package gonzalez_miguel;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author miguelangel
 */
public class Gonzalez_Miguel {

    public static int sp;//sock
    public static int sm;
    public static int su;

    final public static int PP = 10000;//precios $cl
    final public static int PM = 5000;
    final public static int PU = 40000;

    public static int cp = -1;// cantidad negativa para validar
    public static int cm = -1;
    public static int cu = -1;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        java.io.BufferedReader br = new java.io.BufferedReader(new InputStreamReader(System.in));

        sp = 10000;//cantidad inicial
        sm = 1000;
        su = 20000;

        int i = 0;

//inicio de programa
        //MENU:
        while (i != 3) {
            System.out.println("-----------------");
            System.out.println("escoja una opcion");
            System.out.println("-----------------");
            System.out.println("1-----------Venta");
            System.out.println("2-----------Stock");
            System.out.println("3-----------Salir");
            System.out.print("Opcion----->");
            int x = Integer.parseInt(br.readLine());
            System.out.println("");
            System.out.println("");

            switch (x) {
                case 1:
                    venta();  //metodo venta
                    facturacion();  //metodo facturación

                    break;
                case 2:
                    stock();//metodo stock

                    break;
                case 3:
                    i = 3;// salir
                    break;
                default:
                    System.out.println("opción no valida");
                    break;
                //FIN MENU
            }
            if(i!=3){
            int xx = 0;//validacion para continuar
            while (xx != 1) {
                System.out.println("1 para continuar");
                xx = Integer.parseInt(br.readLine());
            }
            }
        }
    }

//VENTA
    public static void venta() throws IOException {
        java.io.BufferedReader br = new java.io.BufferedReader(new InputStreamReader(System.in));

        System.out.println("");
        System.out.println("");
        System.out.println("venta");
        System.out.println("----------------------------------");

        //PERAS
        while (cp < 0) {
            System.out.println("Cajas de peras");
            cp = Integer.parseInt(br.readLine());//cantidad de peras
            if (cp > sp) {
                System.out.println("la venta supera el stock disponible " + sp);
                cp = -1;
            } else {
                sp = (sp - cp);
            }
        }

        //MANZANAS
        while (cm < 0) {
            System.out.println("Cajas de Manzanas");
            cm = Integer.parseInt(br.readLine());//cantidad de manzanas
            if (cm > sm) {
                System.out.println("la venta supera el stock disponible " + sm);
                cm = -1;
            } else {
                sm = (sm - cm);
            }
        }

        //UVAS
        while (cu < 0) {
            System.out.println("Cajas de Uvas");
            cu = Integer.parseInt(br.readLine());//cantidad de uvas
            if (cu > su) {
                System.out.println("la venta supera el stock disponible " + su);
                cu = -1;
            } else {
                su = (su - cu);
            }
        }
    }

//Facturaión
 public static void facturacion() {
     int bp =(cp*PP);//totales brutos
     int bm =(cm*PM);
     int bu =(cu*PU);
     int tp; //totales parciales
     int tm;
     int tu;
        System.out.println("");
        System.out.println("");
        System.out.println("Facturación");
        System.out.println("----------------------------------");   
//peras
        System.out.println("Peras");
        if (cp<1000){
         System.out.println("sin descuento");
         tp=bp;
        }
        else if(cp>=1000 && 5000>cp){
         System.out.println("descuento 5%");
         double temp=bp*0.95;
         tp=(int)temp;
        }
        else{
         System.out.println("descuento 10%");
         double temp=bp*0.90;
         tp=(int)temp;
        }
        System.out.println("Total bruto .....$"+bp);

//manzanas
        System.out.println("");
        System.out.println("Manzanas:");
        if (cm<1000){
         System.out.println("sin descuento");
         tm=bm;
        }
        else if(cm>=1000 && 5000>cm){
         System.out.println("descuento 5%");
         double temp=bm*0.95;
         tm=(int)temp;
        }
        else{
         System.out.println("desuento 10%");
         double temp=bm*0.90;
         tm=(int)temp;
        }
        System.out.println("Total bruto .....$"+bm);
//manzanas
        System.out.println("");
        System.out.println("Uvas");
        if (cu<100){
         System.out.println("sin descuento");
         tu=bu;
        }
        else if(cu>=1000 && 5000>cu){
         System.out.println("descuento 5%");
         double temp=bu*0.95;
         tu=(int)temp;
        }
        else{
         System.out.println("descuento 10%");
         double temp=bu*0.90;
         tu=(int)temp;
        }
        System.out.println("Total bruto .....$"+bu);

    //datos
        int t = (tp + tm + tu);//total a pagar
        System.out.println("");
        System.out.println("Total a pagar....$" + t + ".-");
        System.out.println("");
        System.out.println("----------------------------------");
        System.out.println("");
        System.out.println("");
        cp = -1;
        cm = -1;
        cu = -1;
    
    }

    //STOCK
    public static void stock() throws IOException {
        java.io.BufferedReader br = new java.io.BufferedReader(new InputStreamReader(System.in));
        
        final String OP = "AX10";//codigos
        final String OM = "AX20";
        final String OU = "AX30";
        
        System.out.println("");
        System.out.println("");
        System.out.println("Stock");
        System.out.println("----------------------------------");
        System.out.println("- Pruducto       Codigo  Precio     Cantidad");
        System.out.println("- peras.........." + OP +"....$"+PP+"....." + sp + ".-");
        System.out.println("- Manzanas......." + OM +"....$"+PM+"......" + sm + ".-");
        System.out.println("- Uvas..........." + OU +"....$"+PU+ "....." + su + ".-");
        System.out.println("----------------------------------");
        System.out.println("");

    }
}

