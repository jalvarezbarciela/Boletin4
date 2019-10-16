package bol4_1;

public class Bol4_1 {

    public static void main(String[] args) {
      Coche coche = new Coche();
      coche.acelerar(50);
      coche.frenar(10);
      System.out.println(coche.getVelocidade());
    }
    
}
