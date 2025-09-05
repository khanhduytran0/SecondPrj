/**
 * @description: Test for the Rectangle class
 * @author: duy
 * @version: 1.0
 * @created: 4 thg 9, 2025 20:24:12
 */
package iuh.fit.se;

import java.util.Scanner;

/**
 * Test class
 */
public class TestRectangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Rectangle r = new Rectangle();

		System.out.print("Input width: ");
		r.setWidth(scanner.nextDouble());
		
		System.out.print("Input length: ");
		r.setLength(scanner.nextDouble());

		System.out.println("Perimeter: " + r.getPerimeter());
		System.out.println("Area: " + r.getArea());
		
		System.out.println(r.toString());
	}

}
