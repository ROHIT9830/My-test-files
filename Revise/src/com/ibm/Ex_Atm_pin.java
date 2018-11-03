package com.ibm;
import java.util.Scanner;

public class Ex_Atm_pin {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int pin=1234;
		int input;
		int count =0;
		do {
			System.out.println("Please enter the pin : ");
			input=scan.nextInt();
			count++;
			if (input==pin) {
				System.out.println("Welcome to Kolkata Bank");
			}
			else if(input!=pin && count<3) {
				System.out.println("Try again");
			}
			else {
				System.out.println("your account is locked");
			}
		}
		while(input!=pin && count<3);
	}

}
