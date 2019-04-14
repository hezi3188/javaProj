package testUnit;
import primitives.*;
public class T0 {
    public static void main(String[] args){
        double d1= 1;
        double d2 = 1.99999999999999999999;
        double d3 = 0;
        double d4 = 1234567876543.21;
        double d5 = 4.6;
        double d6 = 1.2;
        pointD3 P1 = new pointD3(new Coordinate(d2),new Coordinate(d5),new Coordinate(d6));
        pointD3 P2 = new pointD3(new Coordinate(d5),new Coordinate(d6),new Coordinate(d1));
        vector T1,T2;
        T1 = new vector(P1);
        T2 = new vector(P2);
        pointD3 P3 = P1.add(T1);
        System.out.println("---------points: ");
        System.out.println("P1: "+P1);
        System.out.println("P2: "+P2);
        System.out.println("P1.distance(P2) "+P1.distance(P2));
        System.out.println("P3.distance(new pointD3()): "+P3.distance(new pointD3()));
        System.out.println("P1.add(T1): "+P3);
        System.out.println("P1.substract(P2): "+P1.substract(P2));
        System.out.println("P1.equals(new pointD3(P1)): "+P1.equals(new pointD3(P1)));
        System.out.println("P1.equals(new pointD3(P2)): "+P1.equals(new pointD3(P2)));
        System.out.println("---------vectors: ");
        System.out.println("T1: "+T1);
        System.out.println("T2: "+T2);
        System.out.println("T1.dotProduct(T2): "+T1.dotProduct(T2));
        System.out.println("T1.crossProduct(T2): "+T1.crossProduct(T2));
        System.out.println("T1.crossProduct(T2).crossProduct(T2): "+T1.crossProduct(T2).crossProduct(T2).normalize());
        System.out.println("T1.normalize(): "+T1.normalize());
        System.out.println("T1.normalize().equals(T1.normalize()): "+T1.normalize().equals(T1.normalize()));
        System.out.println("T1.normalize().equals(T1.normalize()): "+T1.normalize().equals(T2.normalize()));
        System.out.println("T1.length(): "+T1.length());
        System.out.println("T1.normalize().length(): "+T1.normalize().length());
        System.out.println("T2.normalize().length(): "+T2.normalize().length());

    }
}
