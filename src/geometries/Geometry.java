package geometries;

import primitives.*;

public interface Geometry extends Intersectable {
    vector getNormal(pointD3 a);
}
