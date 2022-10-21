package vehicleClasses;

public class Car extends Vehicle{
	private static final String MOVEMENT_TYPE="Riding";
		
		@Override
		public void getMovementType(){
			System.out.println(MOVEMENT_TYPE);
		}
	
}
