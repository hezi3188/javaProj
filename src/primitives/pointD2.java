package primitives;

import java.util.Arrays;
import java.util.Objects;


/**
 * Javadoc formatted documentation
 */


	// ***************** Administration  ******************** //

	/**
	 * Javadoc formatted documentation
	 */


	/**
	 * Javadoc formatted documentation
	 */


	// ***************** Operations ******************** //

public class pointD2 {
		Coordinate x;
		Coordinate y;

		// ***************** Constructors ********************** //
		public pointD2(Coordinate x, Coordinate y) {
			this.point = new Coordinate[2];
			point[0] = x;
			point[1] = y;
		}

		public pointD2() {
			setX(new Coordinate(Coordinate.ZERO)) ;
			setY(new Coordinate(Coordinate.ZERO));
		}
		public pointD2(pointD2 p){
			setX(p.getX());
			setY(p.getY());
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			pointD2 pointD2 = (pointD2) o;
			return Objects.equals(x, pointD2.x) &&
					Objects.equals(y, pointD2.y);
		}

		// ***************** Getters/Setters ********************** //
		public Coordinate getY() {
			return new Coordinate(y);
		}

		public void setY(Coordinate y) {
			this.y =new Coordinate(y);
		}

		public Coordinate getX() {
			return new Coordinate(y);
		}

		public void setX(Coordinate x) {
			this.x =new Coordinate(x);
		}

		@Override
		public String toString() {
			return "pointD2{" +
					"x=" + x +
					", y=" + y +
					'}';
		}
	}