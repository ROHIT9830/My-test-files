package com.ibm;
import java.util.Scanner;;

public class _04Scanner {
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		/*scn is a object of scanner class
		 * To enter double no. 	: scn.nextDouble();
		 * To enter float no. 	: scn.nextFloat();
		 * To enter integer no. : scn.nextInt();
		 * To enter single word	: scn.next();
		 * To enter multiple word/line 	: scn.nextLine();
		*/
		int a=scn.nextInt();
		int b=scn.nextInt();
		int sum = a+b;
		System.out.println("The answer is : "+ sum);
		System.out.println("bye, tcre");
	}

}
//scanner object is present now.....