package primitives;



/**
 * Javadoc formatted documentation
 */
// ***************** Constructors ********************** //

// ***************** Getters/Setters ********************** //


/**
 * Javadoc formatted documentation
 */


/**
 * Javadoc formatted documentation
 */


// ***************** Operations ******************** //


public class vector {
	pointD3 point;

	public vector() {
		this.point = new pointD3();
	}
	public vector(vector vec){
		this.point = new pointD3(vec.getPoint()) ;
	}
	public vector(pointD3 point) {
		this.point = new pointD3(point) ;
	}

	public pointD3 getPoint() {
		return new pointD3(point) ;
	}

	public void setPoint(pointD3 point) {
		this.point = new pointD3(point);
	}

	@Override
	public String toString() {
		return "vector [point=" + point + "]";
	}

	// ***************** Administration  ******************** //
	public vector add(vector vec){
		return this;
	}
	public vector substract(vector vec){
		return  this;
	}
	public vector mult(double scalar){
		return  this;
	}
	public double dotProduct(vector vec){
		return  3;
	}
	public double length (){
		return  3;
	}
	public vector crossProduct(vector vec){
		return  this;
	}
	public vector normalize(){
		return  this;
	}

}
