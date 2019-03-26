package geometries;
import primitives.*;

public class Tube extends RadialGeometry {
    protected ray center;

    public Tube(double radius, ray center) {
        super(radius);
        this.center = new ray(center);
    }

    public ray getCenter() {
        return new ray(center);
    }

    @Override
    public String toString() {
        return "Tube{" +
                "center=" + center +
                ", _radius=" + _radius +
                '}';
    }
}