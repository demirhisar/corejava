package cj05ternarynestedternaryswitch;

import java.util.Scanner;

public class NestedTernary01 {

	/*
	 * Ask user to enter an integer
	 * If the integer is greater than or equal to 0 then check
	 * If it has 2 digits or not
	 * If it has 2 digits its square(a*a) otherwise print its cube (a*a*a)
	 * 
	 * If the integer is less than 0 then check
	 * If it is less than -10 or not
	 * If it is less than -10 print the numer itself otherwise print its absolute value
	 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int a = scan.nextInt();
		
		int result = a >= 0 ? a > 9 && a < 100 ? a * a : a * a * a : a < -9 ? a : a * -1;
		
		System.out.println(result);
		
		scan.close();
	}

}
