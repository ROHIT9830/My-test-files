package com.ibm;
import java.util.Scanner;

public class _05If_Else {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int age=scan.nextInt();
		if (age>=18) {
			System.out.println("You are eligible to vote");
		}
		else {
			System.out.println("You are a minor");
		}
			//Switch case example
			switch (age) {
			case 60:
			case 61:
			case 62:
				System.out.println("Line-1");	//For multiple switch cases
			case 70:							//Single statement
				System.out.println("Line-2");
				break;	
			default:
				System.out.println("Line-General");
			}
	}

}
