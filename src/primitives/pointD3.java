package primitives;

import java.util.Arrays;
import java.util.Objects;


/**
 * Javadoc formatted documentation
 */




/**
 * Javadoc formatted documentation
 */


/**
 * Javadoc formatted documentation
 */


// ***************** Operations ******************** //

public class pointD3 extends pointD2 {
	private Coordinate z;

// ***************** Constructors ********************** //

	public pointD3(Coordinate x,Coordinate y,Coordinate z) {
		super(x,y);
		this.z=z;
	}
	public  pointD3(pointD3 p){
		super(p);
		this.z=new Coordinate(p.z);
	}
	public pointD3() {
		super();
		this.z = new Coordinate(Coordinate.ZERO);
	}

// ***************** Getters/Setters ********************** //
	public Coordinate getZ() {
		return new Coordinate(z);
	}

	public void setZ(Coordinate z) {
		this.z = new Coordinate(z);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		pointD3 pointD3 = (pointD3) o;
		return Objects.equals(z, pointD3.z);
	}

	@Override
	public String toString() {
		return "pointD3{" +
				"z=" + z +
				", x=" + x +
				", y=" + y +
				'}';
	}

	// ***************** Administration  ******************** //

    @Override
	public vector substract(pointD2 p){
		return  new vector(p,this);
	}
	@Override
	public pointD2 add(vector v){
		return (new pointD2());
	}
	@Override
	public double distance(pointD2 p){
		return 5;
	}
	@Override
	public double powDistance(pointD2 p){
		return 5;
	}

}
