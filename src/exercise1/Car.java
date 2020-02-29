package exercise1;

public class Car {
	String name;
	String colour;
	int year;
	
Car (String iName, String iColour, int iYear){
	name = iName;
	colour = iColour;
	year = iYear;
	
	}
void displayName() {
	System.out.println("The name of Car is: " + name);
}
void displayColour() {
	System.out.println("The colour of car is: " + colour);
	System.out.println("The year of make is: " + year);
}
void changeGear(int gearNo) {
	System.out.println("Changing to gear " + gearNo);
	
}
int accelerate() {
	int speed = 20;
	return speed;
}

}




