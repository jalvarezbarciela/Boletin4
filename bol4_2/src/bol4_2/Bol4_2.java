
package bol4_2;

import java.util.Scanner;

public class Bol4_2 {

    public static void main(String[] args) {
       Satelite sat1= new Satelite();
       sat1.verPosicion();
       Satelite satelite = new Satelite(21,22,2000);
       System.out.println("O satelite atopase  no paralelo "+ satelite.paralelo() + " meridiano "+ satelite.meridiano()+ " a unha distancia da terra " + satelite.distancioaTerra()); 
       Scanner sc = new Scanner(System.in);
       System.out.println("Valor meridiano = ");
       double meridiano=sc.nextDouble();
       System.out.println("Valor paralelo= ");
       double paralelo= sc.nextDouble();
       System.out.println("Valor distancia terra= ");
       double distanciaTerra= sc.nextDouble();
       Satelite sat3= new Satelite(meridiano,paralelo,distanciaTerra);
       sat3.verPosicion();
               
       
    }
    
}
