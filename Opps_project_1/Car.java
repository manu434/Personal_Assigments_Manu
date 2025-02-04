package assigments.Opps_project_1;

public class Car extends Vehicle {
	private int numDoors;

	// Constructor
	public Car(String make, String model, int year, int numDoors) {
		super(make, model, year); // Call the base class constructor
		this.numDoors = numDoors;
	}

	// Override displayDetails() to include car-specific details
	@Override
	public void displayDetails() {
		System.out.println("Car: " + getMake() + " " + getModel() + " (" + getYear() + ")");
		System.out.println("Number of Doors: " + numDoors);
	}
}