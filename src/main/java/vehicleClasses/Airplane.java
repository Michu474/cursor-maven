package vehicleClasses;

public class Airplane extends Vehicle{
private static final String MOVEMENT_TYPE="Flying";	
	
	@Override
	public void getMovementType(){
		System.out.println(MOVEMENT_TYPE);
	}
	
}
