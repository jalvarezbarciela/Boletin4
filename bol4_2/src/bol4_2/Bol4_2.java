
package bol4_2;

public class Bol4_2 {

    public static void main(String[] args) {
       Satelite satelite = new Satelite(21,22,2000);
       System.out.println("O satelite atopase  no paralelo "+ satelite.paralelo() + " meridiano "+ satelite.meridiano()+ " a unha distancia da terra " + satelite.distancioaTerra()); 
      
       
    }
    
}
