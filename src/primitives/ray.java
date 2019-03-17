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



public class ray {
	 pointD3 start;
	 vector vec;

	public ray(pointD3 strat, vector vec) {
		super();
		this.start = strat;
		this.vec = vec;
	}
	@Override
	public String toString() {
		return "ray [strat=" + start + ", vec=" + vec + "]";
	}
}
