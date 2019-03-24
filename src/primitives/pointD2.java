package primitives;

import java.util.Arrays;
import java.util.Objects;







public class pointD2 {
		protected Coordinate x;
		protected Coordinate y;

		// ***************** Constructors ********************** //
		public pointD2(Coordinate x, Coordinate y) {
			this.x=new Coordinate(x);
			this.y=new Coordinate(y);
		}

		public pointD2() {
			setX(new Coordinate(Coordinate.ZERO)) ;
			setY(new Coordinate(Coordinate.ZERO));
		}
		public pointD2(pointD2 p){
			setX(p.getX());
			setY(p.getY());
		}

	// ***************** Operations ******************** //
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
		// ***************** Administration  ******************** //
		public vector substract(pointD2 p){

		}
		public pointD2 add(vector v){
				return (new pointD2());
		}
		public double distance(pointD2 p){
				return 5;
		}
		public double powDistance(pointD2 p){
			return 5;
		}

}