package lab4;

import java.util.Scanner;

public class Lab4 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userInt;
		boolean goAgain;
		
		do {
			System.out.println("Enter an integer under 1200:");
			userInt = scnr.nextInt();
			//Squares and Cubes Table Header Row
			System.out.printf("%-10s | %-10s | %-10s\n", "Number", "Squared", "Cubed" );
			System.out.printf("%-10s | %-10s | %-10s\n", "==========", "==========", "==========" );
			//Table Columns and Rows
			for (int i = 1; i <= userInt; i++) {
				System.out.printf("%-10d | %-10d | %-10d\n", i, i*i, i*i*i );
			}
			System.out.println("\n");
			//Multiplication Table Header Row 1 (i)
			System.out.printf("%-8s", " ");
			for (int i = 1; i <= userInt; i++) {
				if (i == userInt) {
					System.out.printf("%-5d\n", i);
					continue;
				}
				System.out.printf("%-5d | ", i);
			}
			//Multiplication Table Header Row 2
			System.out.printf("%-8s", " ");
			for (int i = 1; i <= userInt; i++) {
				if (i == userInt) {
					System.out.printf("%-5s\n", "=====");
					continue;
				}
				System.out.printf("%-5s", "===== | ");
			}
	
			//Multiplication Column 1 (j) and Rows (k)
			for (int j = 1; j <= userInt; j++) {
				System.out.printf("%-5d | ", j);
				// don't want new line after each row// System.out.println();
				for (int k = 1; k <= userInt; k++) {
					
					if (k == userInt) {
						System.out.printf("%-5d\n", k * j);
						continue;
					}
					System.out.printf("%-5d | ", k * j);
				}
			}
			
			System.out.println("\n\nWould you like to go again?");
			goAgain = scnr.next().toLowerCase().startsWith("y");
		} while (goAgain);
		System.out.println("Goodbye.");
	}

}
