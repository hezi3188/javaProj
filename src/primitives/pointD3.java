package primitives;

import java.util.Arrays;


/**
 * Javadoc formatted documentation
 */
// ***************** Constructors ********************** //

// ***************** Getters/Setters ********************** //

// ***************** Administration  ******************** //

/**
 * Javadoc formatted documentation
 */


/**
 * Javadoc formatted documentation
 */


// ***************** Operations ******************** //

public class pointD3 {
	Coordinate[] point;

	public pointD3(Coordinate x,Coordinate y,Coordinate z) {
		point = new Coordinate[3] ;
		point[0]=x;
		point[1]=y;
		point[2]=z;
	}

	@Override
	public String toString() {
		return "pointD3 [point=" + Arrays.toString(point) + "]";
	}
	
}
