package com.ibm;
	public class _01HelloWorld{
		int a=10;		/*instance variable	: declared inside class but outside method*/ //block style
		static int b=20;//static variable	: declared inside class and cannot be local, memory created only once //Line style
		
		public static void main(String[]args) {
			int c=30;	/**local variable : declared inside method, must be initiated*/ //Documentation style
			System.out.println("Hello World..!!");
			System.out.println(c);
			//Primitive_Data_types : boolean, char, byte , short, int , long, float, double
			//Examples : String name;	int age; double temp;
			int y=3;
			float x=y;//Allowed since its a Widening conversion and value of x will be 3.0
			System.out.println(x);
			float d=5.3f;
			//int e= d will throw error since its a Narrowing conversion and hence needs type casting
			int e= (int)d;
			System.out.println(e);//Type casting done and no error with output as 5
		}
		
	}
