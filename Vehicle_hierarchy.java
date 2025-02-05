//Question: Create a program to manage a Vehicle hierarchy.
//Abstract Class: Vehicle
//
//Attributes: brand (String), year (int)
//Method: showDetails() – Abstract method
//Constructor: Accepts brand and year and initializes them.
//Class Car (inherits from Vehicle)
//
//Additional attribute: fuelType (String)
//Constructor: Accepts brand, year, and fuelType and initializes them.
//Overrides showDetails() to display details of the car.
//Class Bike (inherits from Vehicle)
//
//Additional attribute: engineCapacity (int)
//Constructor: Accepts brand, year, and engineCapacity and initializes them.
//Overrides showDetails() to display details of the bike.
//Main Class: Create objects of both Car and Bike, and call the showDetails() method for each.

package bannking;

abstract class Vehicle {
	String brand;
	int year;

	// constructor for vehicle:
	Vehicle(String brand, int year) {
		this.brand = brand;
		this.year = year;
	}

	abstract void Showdetails();

}

class Car extends Vehicle {
	String fueltype;

	Car(String brand, int year, String fuelType) {
		super(brand, year);
		this.fueltype = fuelType;
	}

	@Override
	void Showdetails() {
		System.out.println(brand);
		System.out.println(year);
		System.out.println(fueltype);

	}

}

class Bike extends Vehicle {
	int enginecapacity;

	Bike(String brand, int year, int enginecapacity) {
		super(brand, year);
		this.enginecapacity = enginecapacity;

	}

	@Override
	void Showdetails() {
		System.out.println(brand);
		System.out.println(year);
		System.out.println(enginecapacity);

	}

}

public class Vehicle_hierarchy {
	public static void main(String[] args) {
		Car c = new Car("Tata", 2019, "deiesl");
		c.Showdetails();
		System.out.println();
		Bike b = new Bike("yamaha", 2018, 3);
		b.Showdetails();

	}

}
