package geometries;
import primitives.*;

public class Sphere extends RadialGeometry{
    protected pointD3 center;

    public Sphere(double radius, pointD3 center) {
        super(radius);
        this.center = new pointD3(center);
    }

    public Sphere(RadialGeometry obj, pointD3 center) {
        super(obj);
        this.center = new pointD3(center);
    }

    public pointD3 getCenter() {
        return new pointD3(center);
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "center=" + center +
                ", _radius=" + _radius +
                '}';
    }
}