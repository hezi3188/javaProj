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
		return  new vector(
					new pointD3(
							this.getPoint().getX().subtract(
									new Coordinate(vec.getPoint().getX())
							),
							this.getPoint().getY().subtract(
									new Coordinate(vec.getPoint().getY())
							),
							this.getPoint().getZ().subtract(
									new Coordinate(vec.getPoint().getZ())
							)
					)
		);
	}
	public double dotProduct(vector vec){
		vector temp=  new vector(
				new pointD3(
						this.getPoint().getX().multiply(
								new Coordinate(vec.getPoint().getX())
						),
						this.getPoint().getY().multiply(
								new Coordinate(vec.getPoint().getY())
						),
						this.getPoint().getZ().multiply(
								new Coordinate(vec.getPoint().getZ())
						)
				)
		);
		return new Coordinate(
				this.getPoint().getX().add(
						this.getPoint().getY()).add(
								this.getPoint().getZ())
		).get();
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

	public double length (){
		return  3;
	}
	public vector crossProduct(vector vec){
		Coordinate x1,y1,z1,x2,y2,z2,newX,newY,newZ;
		x1=new Coordinate(this.getPoint().getX());
		y1=new Coordinate(this.getPoint().getY());
		z1=new Coordinate(this.getPoint().getZ());
		x2=new Coordinate(vec.getPoint().getX());
		y2=new Coordinate(vec.getPoint().getY());
		z2=new Coordinate(vec.getPoint().getZ());
		newX=new Coordinate(
				(

				)
		);
		return  new vector(
				new pointD3(
						this.getPoint().getX().subtract(
								new Coordinate(vec.getPoint().getX())
						),
						this.getPoint().getY().subtract(
								new Coordinate(vec.getPoint().getY())
						),
						this.getPoint().getZ().subtract(
								new Coordinate(vec.getPoint().getZ())
						)
				)
		);
	}
	public vector normalize(){
		return  this;
	}

}
