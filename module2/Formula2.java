package module2;

import java.util.Scanner;

public class Formula2 {

	public static void main(String[] args) {
		double a, b, c, root, resault;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a");
		while (scanner.hasNextDouble() == false) {
			scanner.next();
			System.out.println("Enter double a");
		}
		a = scanner.nextDouble();
		
		System.out.println("Enter b");
		while (scanner.hasNextDouble() == false) {
			scanner.next();
			System.out.println("Enter double b");
		}
		b = scanner.nextDouble();
		
		System.out.println("Enter c");
		while (scanner.hasNextDouble() == false) {
			scanner.next();
			System.out.println("Enter double c");
		}
		c = scanner.nextDouble();
		
		root = b * b + 4 * a * c;
		if (a == 0) {
			System.out.println("a can be divided on zero");
		}
		else if (root < 0) {
			System.out.println("square root can not be extracted");
		}
		else {
			resault = ((b + Math.sqrt(root)) / 2 * a) - a * a * a * c + b;
			System.out.println("Result = " + resault);
		}
	}

}