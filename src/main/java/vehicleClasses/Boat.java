package vehicleClasses;

public class Boat extends Vehicle{
	private static final String MOVEMENT_TYPE="Swimming";	
	
	@Override
	public void getMovementType(){
		System.out.println(this.MOVEMENT_TYPE);
	}
	
}
