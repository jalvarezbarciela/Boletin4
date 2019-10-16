package bol4_1;

import java.util.Scanner;

public class Bol4_1 {

    public static void main(String[] args) {
      
      Scanner sc=new Scanner(System.in); 
      Coche coche = new Coche();
      int v;
      System.out.println("Cuanto ha acelerado");
      v=sc.nextInt();
      coche.acelerar(v);
      System.out.println("Cuanto ha frenado");
      v=sc.nextInt();
      coche.frenar(v);
      System.out.println(coche.getVelocidade());
    }
    
}
