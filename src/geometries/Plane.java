package geometries;
import primitives.*;

public class Plane {
    protected pointD3 a;
    protected ray cross;

    public Plane(pointD3 a, ray cross) {
        this.a = new pointD3(a);
        this.cross = new ray(cross);
    }

    public pointD3 getA() {
        return new pointD3(a);
    }

    public ray getCross() {
        return new ray(cross);
    }

    @Override
    public String toString() {
        return "Plane{" +
                "a=" + a +
                ", cross=" + cross +
                '}';
    }
}