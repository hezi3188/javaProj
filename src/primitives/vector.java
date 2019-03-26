package primitives;
public class vector {
	pointD3 point;
// ***************** Constructors ********************** //

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
// ***************** Getters/Setters ********************** //

	public void setPoint(pointD3 point) {
		this.point = new pointD3(point);
	}

	@Override
	public String toString() {
		return "vector [point=" + point + "]";
	}

	// ***************** Administration  ******************** //
	public vector add(vector vec){
		return new vector(new pointD3(this.getPoint().add(vec)));
	}
	public vector substract(vector vec){
		return  ;
	}
	public vector multScalar(double scalar){
		Coordinate Scal = new Coordinate(scalar);
		return  new vector(
				new pointD3(
						this.getPoint().getX().multiply(Scal),
						this.getPoint().getY().multiply(Scal),
						this.getPoint().getZ().multiply(Scal)
				)
		);
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
