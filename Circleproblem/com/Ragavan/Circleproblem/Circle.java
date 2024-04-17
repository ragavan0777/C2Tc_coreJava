package com.Ragavan.Circleproblem;
import java.util.Scanner;
public class Circle {
	int Radius;
	String Color;
	
		Scanner scanner = new Scanner(System.in);
		public void getinput() {
		System.out.println("Enter the radius :");
		Radius = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter the color :");
		Color = scanner.nextLine();
		scanner.close();

	}
	public double calculate_area() {
		return 3.14 * Radius * Radius;
	}

}