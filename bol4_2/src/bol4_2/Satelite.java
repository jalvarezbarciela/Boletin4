package bol4_2;
public class Satelite{
private double meridiano;
private double paralelo;
private double distanciaTerra;

public Satelite(){
    meridiano = paralelo = distanciaTerra = 0;
   }
public Satelite (double m, double p, double d){
    meridiano = m;
    paralelo = p;
    distanciaTerra = d;
}
public double meridiano(){
   double mer = meridiano;
     return mer;
   
}
public double paralelo(){
    double par = paralelo;
    return par;
}
public double distancioaTerra(){
    double dist = distanciaTerra;
    return dist;
}
    
   

}
