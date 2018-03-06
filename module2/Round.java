package module2;

import java.util.*;

public class Round {

	public static void main(String[] args) {
		double r, square, lenght;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter R");
		while (scanner.hasNextDouble() == false) {
			scanner.next();
			System.out.println("Enter digit = ");
		}	
			r = scanner.nextDouble();
			square = Math.PI * r * r;
			lenght = 2 * Math.PI * r;
			System.out.println("Площадь круга = " + square);
			System.out.println("Длина окружности = " + lenght);
	}

}