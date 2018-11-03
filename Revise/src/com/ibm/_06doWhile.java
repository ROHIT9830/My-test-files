package com.ibm;

public class _06doWhile {
	public static void main(String[] args) {
		int i=10;
		while (i>0) {					//In while loop, the loop will run 0 to n times
			System.out.println(i);
			i--;
			
		}
		System.out.println("---------------------");
		do {
			System.out.println(i);			//In do while loop, the loop will run atleast once
			i++;
		}
		while(i<10);
	}
	
}
