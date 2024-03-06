package lab3;

import java.util.Scanner;

// Class that implements interface package
class Box implements Package {

	// variable declaration
	double weight;

	public Box() {
	}

	// Method that calculates weight * cost of a box
	public double cost() {
		weight = weight * 1.2;
		return weight;
	}

	// Method that requests the weight (in lbs) of a box
	public void input(Scanner scanner) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please input the weight of " + getClass().getSimpleName() + "(lbs): ");
		weight = scan.nextDouble();
	}

}