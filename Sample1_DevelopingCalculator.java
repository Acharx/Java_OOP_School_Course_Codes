package java1;

import java.util.Scanner;

public class Sample1_DevelopingCalculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x1,x2;
		char operand;
		
		System.out.println("first variable");
		x1=scan.nextInt();
		System.out.println("second variable");
		x2=scan.nextInt();
		System.out.println("Enter the operand");
		operand=scan.next().charAt(0);
		if(operand=='+') {
			System.out.println("x1+x2 : "+ (x1+x2));
		}else if(operand=='-') {
			System.out.println("x1-x2 : "+(x1-x2));
		}else if(operand=='*') {
			System.out.println("x1*x2 : " + (x1*x2));
		}else if(operand=='/') {
			if(x2!=0) {
				System.out.println("x1/x2 : " + ((float)x1/(float)x2));
			}else {
				System.out.println("Undefined Value !!");
			}
		}else if(operand=='%') {
			System.out.println("x1%x2 : " + (x1 % x2));
			
		}
	}
		
		
	}

