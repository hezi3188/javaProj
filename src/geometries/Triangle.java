package geometries;
import primitives.*;

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

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}