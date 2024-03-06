package lab3;

import java.util.Scanner;

// Class that implements interface package
class Letter implements Package {

	// Variable declaration
	double pages;

	public Letter() {
	}

	// Method that calculates the cost of pages per number of pages
	public double cost() {
		pages = pages * .05;
		return pages;
	}

	//  Method that requests number of pages from user
	public void input(Scanner scanner) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please input the number of pages for the letter(pgs): ");
		pages = scan.nextDouble();
	}
}