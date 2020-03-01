package exercise1;

public class ExecutionCar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car alto = new Car("Alto", "Black", 2020);
alto.displayName();
alto.displayColour();
alto.changeGear(2);
int speed = alto.accelerate();
System.out.println("Accelerating speed by: " + speed + "km/hr");
	}

}
