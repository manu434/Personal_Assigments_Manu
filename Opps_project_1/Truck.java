package assigments.Opps_project_1;

public class Truck extends Vehicle {
	private double cargoCapacity;

	// Constructor
	public Truck(String make, String model, int year, double cargoCapacity) {
		super(make, model, year); // Call the base class constructor
		this.cargoCapacity = cargoCapacity;
	}

	// Override displayDetails() to include truck-specific details
	@Override
	public void displayDetails() {
		System.out.println("Truck: " + getMake() + " " + getModel() + " (" + getYear() + ")");
		System.out.println("Cargo Capacity: " + cargoCapacity + " tons");
	}
}