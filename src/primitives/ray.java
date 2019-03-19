package primitives;


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



public class ray extends vector {
	 pointD3 start;

	public ray(pointD3 strat, vector vec) {
		super();
		this.start = new pointD3(strat);
	}
	public ray (ray r){
		super(r);
		this.start = new pointD3(r.getStart());
	}
	public ray(){
		super();
		start = new pointD3();
	}

	public pointD3 getStart() {
		return new pointD3(start);
	}

	public void setStart(pointD3 start) {
		this.start = new pointD3(start) ;
	}

	@Override
	public String toString() {
		return "ray [strat=" + start + ", vec=" + vec + "]";
	}
}
