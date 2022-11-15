package Logical_programs;

public class swapping {
// swapping using 3rd variable
	public static void main(String[] args) {
		System.out.println("before swapping:");
		int a=2;
		int b=4;
		System.out.println("a ="+a+" and "+"b ="+b);
		int c=a;//c=2
		a=b;//a=4
	    b=c;//b=2
	    
	    System.out.println("after swapping:");
	    System.out.println("a ="+a+" and "+"b ="+b);
	}
}