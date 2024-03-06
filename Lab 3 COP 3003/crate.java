package lab3;

import java.util.Scanner;

// Class that implements interface package
public abstract class Crate implements Package {
	//Variable declaration
	protected Object obj;
	double weight;

	// Method that implements a display of class name
	// of an object by reference of a variable
	public void input(Scanner scanner) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please input the weight of " + getClass().getSimpleName() + "(lbs): ");
		weight = scan.nextDouble();

	}
}
