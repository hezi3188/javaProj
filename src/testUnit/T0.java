package testUnit;
import elements.Camera;
import primitives.*;
import geometries.*;

import java.util.ArrayList;
import java.util.List;

public class T0 {
    public static void main(String[] args){
        /*double d1= 1;
        double d2 = 1.99999999999999999999;
        double d3 = 0;
        double d4 = 1234567876543.21;
        double d5 = 4.6;
        double d6 = 1.2;
        pointD3 P1 = new pointD3(new Coordinate(2),new Coordinate(2),new Coordinate(0));
        pointD3 P2 = new pointD3(new Coordinate(1),new Coordinate(0),new Coordinate(5));
        pointD3 P4 = new pointD3(new Coordinate(0),new Coordinate(2),new Coordinate(8));
        pointD3 P5 = new pointD3(new Coordinate(1),new Coordinate(1),new Coordinate(10));
        vector T1,T2;
        Plane PL;
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
        System.out.println("T1.crossProduct(T2).crossProduct(T2).normalize(): "+T1.crossProduct(T2).crossProduct(T2).normalize());
        System.out.println("T1.normalize(): "+T1.normalize());
        System.out.println("T1.normalize().equals(T1.normalize()): "+T1.normalize().equals(T1.normalize()));
        System.out.println("T1.normalize().equals(T1.normalize()): "+T1.normalize().equals(T2.normalize()));
        System.out.println("T1.length(): "+T1.length());
        System.out.println("T1.normalize().length(): "+T1.normalize().length());
        System.out.println("T2.normalize().length(): "+T2.normalize().length());
        System.out.println("T1.add(T2): "+T1.add(T2));
        System.out.println("T1.add(T2).substract(T1): "+T1.add(T2).substract(T1));
        System.out.println("T1.add(T2).substract(T1).equals(T2)): "+T1.add(T2).substract(T1).equals(T2));
        System.out.println("T1.multScalar(T2.length()): "+T1.multScalar(T2.length()));
        System.out.println("vector.isZero(T1.substract(T1)): "+vector.isZero(T1.substract(T1)));
        PL = new Plane(P1,P2,P3);
        ray cu = new ray(P4,new vector(P5));
        System.out.println("cu: "+cu);
        System.out.println("PL: "+PL);
        System.out.println("PL.getZofPlane(): "+PL.getZofPlane());
        System.out.println("PL.findIntersections(cu).get(0): "+PL.findIntersections(cu).get(0));
        System.out.println("cu.getStart(): "+cu.getStart());
        System.out.println("PL.findIntersections(cu).get(0).distance(cu.getStart()): "+PL.findIntersections(cu).get(0).distance(cu.getStart()));
        P1 = new pointD3(new Coordinate(4),new Coordinate(-4),new Coordinate(4));
        P2 = new pointD3(new Coordinate(-3),new Coordinate(3),new Coordinate(5));
        P4 = new pointD3(new Coordinate(5),new Coordinate(2),new Coordinate(5));
        P5 = new pointD3(new Coordinate(1.8),new Coordinate(3.8),new Coordinate(9.8));
        pointD3 P6 = new pointD3(new Coordinate(-1),new Coordinate(-1),new Coordinate(-1));
        pointD3 P7 = new pointD3(new Coordinate(200),new Coordinate(50),new Coordinate(0));
        pointD3 P8 = new pointD3(new Coordinate(20),new Coordinate(0),new Coordinate(0));
        pointD3 P9 = new pointD3(new Coordinate(100),new Coordinate(80),new Coordinate(150));
        cu = new ray(P8,new vector(P9));
        Triangle Tr = new Triangle(P1,P2,P4);
        //System.out.println("Tr.findIntersections(cu).get(0): "+Tr.findIntersections(cu).get(0));
        Sphere S = new Sphere(180,P7);
        System.out.println("S.findIntersections(cu).get(0): "+S.findIntersections(cu).get(0));*/

                ///////////////////////

                final int WIDTH = 3;
                final int HEIGHT = 3;
                ray[][] rays = new ray [HEIGHT][WIDTH];
                Camera camera = new Camera(new pointD3(0.0 ,0.0 ,0.0),
                        new vector (new pointD3(0.0, 1.0, 0.0)),
                        new vector (new pointD3(0.0, 0.0, -1.0)));
// plane orthogonal to the view plane

                Plane plane = new Plane( new pointD3(0.0, 0.0, -3.0), new vector(new pointD3(0.0, 0.0, -1.0)));
                // 45 degrees to the view plane
                Plane plane2 = new Plane( new pointD3(0.0, 0.0, -3.0),new vector(new pointD3(0.0, 0.25, -1.0)));
                List<pointD3> intersectionPointsPlane = new ArrayList<pointD3>();
                List<pointD3> intersectionPointsPlane2 = new ArrayList<pointD3>();
                System.out.println("Camera:\n" + camera);
                for (int i = 0; i < HEIGHT; i++){
                    for (int j = 0; j < WIDTH; j++){
                        rays[i][j] = camera.constructRayThroughPixel(
                                WIDTH, HEIGHT, j, i, 1, 3 * WIDTH, 3 * HEIGHT);
                        List<pointD3> rayIntersectionPoints = plane.findIntersections(rays[i][j]);
                        List<pointD3> rayIntersectionPoints2 = plane2.findIntersections(rays[i][j]);
                        for (pointD3 iPoint: rayIntersectionPoints)
                            intersectionPointsPlane.add(iPoint);
                        for (pointD3 iPoint: rayIntersectionPoints2)
                            intersectionPointsPlane2.add(iPoint);
                    }
                }
                if(intersectionPointsPlane.size() == 9){System.out.println("True");} else {System.out.println("False");}
                if(intersectionPointsPlane2.size() == 9) {System.out.println("true");}else {System.out.println("False");};
                for (pointD3 iPoint: intersectionPointsPlane)
                    System.out.println(iPoint);
                System.out.println("---");
                for (pointD3 iPoint: intersectionPointsPlane2)
                    System.out.println(iPoint);


    }
}
