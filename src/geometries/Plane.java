package geometries;
import primitives.*;

public class Plane implements Geometry {
    protected pointD3 a;
    protected vector cross;

    public Plane(pointD3 a, vector cross) {
        this.a = new pointD3(a);
        this.cross = new vector(cross).normalize();
    }

    public Plane(pointD3 a, pointD3 b, pointD3 c) {
        this.a = new pointD3(a);
        this.cross = new vector(a.substract(b)).crossProduct(new vector(b.substract(c))).normalize();
    }

    public pointD3 getA() {
        return new pointD3(a);
    }

    public vector getCross() {
        return new vector(cross);
    }

    @Override
    public String toString() {
        return "Plane{" +
                "a=" + a +
                ", cross=" + cross +
                '}';
    }

    @Override
    public vector getNormal(pointD3 a) {
        return new vector(cross);
    }
}