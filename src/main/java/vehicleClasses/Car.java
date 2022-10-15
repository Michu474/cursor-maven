package vehicleClasses;

public class Car extends Vehicle{
	pprivate static final String MOVEMENT_TYPE="Riding";	
		
		@Override
		public void getMovementType(){
			System.out.println(this.MOVEMENT_TYPE);
		}
	
}
