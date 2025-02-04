package assigments.Opps_project_1;

public class Bike extends Vehicle {
	private boolean hasSideCar;

	// Constructor
	public Bike(String make, String model, int year, boolean hasSideCar) {
		super(make, model, year); // Call the base class constructor
		this.hasSideCar = hasSideCar;
	}

	// Override displayDetails() to include bike-specific details
	@Override
	public void displayDetails() {
		System.out.println("Bike: " + getMake() + " " + getModel() + " (" + getYear() + ")");
		System.out.println("Has Side Car: " + (hasSideCar ? "Yes" : "No"));
	}
}