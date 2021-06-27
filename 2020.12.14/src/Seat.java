
public class Seat {

	int id;
	ClassTypeE classType; 
	boolean taken = false;
	
	public Seat(int id) {
		if(id<6&&id>0) {
			classType = ClassTypeE.FIRST;
			this.id = id;
		}
		else {
			classType = ClassTypeE.ECONOMY;
			this.id = id;
		}
	}

	public void takeTheSeat() {
		taken=true;
	}
	/**
	 * @return the taken
	 */
	public boolean isTaken() {
		return taken;
	}

	/**
	 * @return the classType
	 */
	public ClassTypeE getClassType() {
		return classType;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
}
