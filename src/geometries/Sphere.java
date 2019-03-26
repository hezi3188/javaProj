package geometries;
import primitives.*;

public class Sphere extends RadialGeometry{
    protected pointD3 center;

    public Sphere(double radius, pointD3 center) {
        super(radius);
        this.center = center;
    }

    public Sphere(RadialGeometry obj, pointD3 center) {
        super(obj);
        this.center = center;
    }
}