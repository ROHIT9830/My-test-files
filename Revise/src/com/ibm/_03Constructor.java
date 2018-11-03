package com.ibm;

public class _03Constructor {
	private int a;
	private int b;
	private int c;
	
	public _03Constructor(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public void showDimension() {
		System.out.println("Length of 1st side= "+a);
		System.out.println("Length of 2nd side= "+b);
		System.out.println("Length of 3rd side= "+c);
	}
	public static void main(String[] args) {
		_03Constructor side = new _03Constructor(10,20,30);	/*This is a test file for constructor and 
													should be written seperately making a test class*/
		side.showDimension();
	}
}
