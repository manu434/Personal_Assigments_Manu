package assigments.Opps_project_1;

public class Vehicle {
	// Common attributes for all vehicles
	private String make;
	private String model;
	private int year;

	// Constructor to initialize attributes
	public Vehicle(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}

	// Getters
	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	// Method to display vehicle details (to be overridden by subclasses)
	public void displayDetails() {
		System.out.println("Vehicle: " + make + " " + model + " (" + year + ")");
	}
}
