package geometries;
import primitives.*;

import java.util.List;

public class Triangle extends Plane {
    protected pointD3 a;
    protected pointD3 b;
    protected pointD3 c;

    public Triangle(pointD3 a, pointD3 b, pointD3 c) {
        super(a, b, c);
        this.a = new pointD3(a);
        this.b = new pointD3(b);
        this.c = new pointD3(c);
    }

    public pointD3 getA() {
        return new pointD3(a);
    }

    public pointD3 getB() {
        return new pointD3(b);
    }

    public pointD3 getC() {
        return new pointD3(c);
    }
    public List<pointD3> findIntersections(ray R) {
        List<pointD3> cut = super.findIntersections(R);
        pointD3 P = cut.get(0);
        vector v1 = a.substract(R.getStart());
        vector v2 = b.substract(R.getStart());
        vector v3 = c.substract(R.getStart());
        vector N1 = v1.crossProduct(v2).normalize();
        vector N2 = v2.crossProduct(v3).normalize();
        vector N3 = v3.crossProduct(v1).normalize();
        double num1 = P.substract(R.getStart()).dotProduct(N1);
        double num2 = P.substract(R.getStart()).dotProduct(N2);
        double num3 = P.substract(R.getStart()).dotProduct(N3);
        if(num1>0 && num2>0 && num3 >0) return cut;
        if(num1<0 && num2<0 && num3 <0) return cut;
        return null;
    }
    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}