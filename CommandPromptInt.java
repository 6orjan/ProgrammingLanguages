package chas4;

import java.util.Scanner;

public class zadacha3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		
		System.out.println("Decimal " + number);
		System.out.println("Binary " + Integer.toBinaryString(number));  
		System.out.println("Hexa " + Integer.toHexString(number)); 
		System.out.println("Octal " + Integer.toOctalString(number)); 
	}

}
