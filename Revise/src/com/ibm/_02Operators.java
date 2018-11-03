package com.ibm;

public class _02Operators {

	public static void main(String[] args) {
		int a=10,b=10, c=10,d=10,i=10,k=1;
		boolean j=true;
		System.out.println(a++);	//Postfix operator : value returned first and den incremented/decremented
		System.out.println(b--);
		System.out.println(++c);	//Prefix operator : value incremented/decremented first and den returned
		System.out.println(--d);
		System.out.println(+i);		//unary
		System.out.println(-i);		
		System.out.println(~k);     //Bitwise complement
		System.out.println(!j);		//Logical NOT
		int x=20;
		x+=50;						//Relational operator meaning x=x+50
		System.out.println("Relational operator output is= "+x);
		int m=10, n=20;
		int min=(m>n)?m:n;			//Ternary operator: If true m is o/p else n is o/p
		System.out.println(min);
									/*Other logical operators include :
		&& : true if both left and right operand is true, else false
		|| : true if either left or right operand is true, else false
		Bitwise & : checks both condition
		Bitwise | : checks both condition
		*/
	}

}
