package java1;

import java.util.Scanner;

public class ScannerExampleInDouble {
	public static void main (String[] args) {
		
		int miles;
		double gallons,mpg;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number od miles: ");
		miles = scan.nextInt();
		
		System.out.println("Enter the gallons of fuel used: ");
		gallons = scan.nextDouble();
		
		mpg = miles / gallons;
		
		System.out.println("Miles per Gallons: "+ mpg);
	}
}
