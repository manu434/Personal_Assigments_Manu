package assigments.Opps_project_1;

public class Main {
	public static void main(String[] args) {
		// Create objects of different vehicle types
		Vehicle car = new Car("Toyota", "Camry", 2020, 4);
		Vehicle bike = new Bike("Harley-Davidson", "Street 750", 2019, false);
		Vehicle truck = new Truck("Ford", "F-150", 2021, 2.5);

		// Use polymorphism to call the overridden displayDetails() method
		System.out.println("--- Vehicle Details ---");
		car.displayDetails();
		System.out.println();
		bike.displayDetails();
		System.out.println();
		truck.displayDetails();
	}
}