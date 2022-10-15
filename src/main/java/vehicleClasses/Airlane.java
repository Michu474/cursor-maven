package vehicleClasses;

public class Airlane extends Vehicle{
private static final String MOVEMENT_TYPE="Flying";	
	
	@Override
	public void getMovementType(){
		System.out.println(this.MOVEMENT_TYPE);
	}
	
}
