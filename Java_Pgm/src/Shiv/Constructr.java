package Shiv;

import java.util.Scanner;

class Box {
	double width, lenght, height;

	Scanner sc = new Scanner(System.in);

	Box() {
		System.out.println(" Constructor has Started");

		/*
		 * width=2; lenght=3; height=4;
		 */
		System.out.println("Enter value of width , lenght and Height :");
		width = sc.nextDouble();
		lenght = sc.nextDouble();
		height = sc.nextDouble();

	}

	void Volume() {
		double vol = width * lenght * height;
		System.out.println(" Volume of Box :" + vol);
	}
}

public class Constructr {
	public static void main(String[] args) {
		Box b = new Box();
		b.Volume();
	}

}
