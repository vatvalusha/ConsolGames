package home.mass;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		String line1;
		String line2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first line: ");
		line1 = scanner.nextLine();
		System.out.println("Enter the second line: ");
		line2 = scanner.nextLine();
		if(line1.length() > line2.length())System.out.println("The first line mero than second");
		else if(line1.length() == line2.length())System.out.println("The lines the same");
		else System.out.println("The second line mero than first");

	}

}
