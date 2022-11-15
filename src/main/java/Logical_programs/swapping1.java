package Logical_programs;

public class swapping1 {
//swapping without using 3rd variable
	public static void main(String[] args) {
		System.out.println("before swapping:");
		int a=20;
		int b=30;
		System.out.println("a= "+a+" and "+"b= "+b);
		
		a=a+b;//a=50
		b=a-b;//b=50-30=20
		a=a-b;//a=50-20=30
		 System.out.println("after swapping:");
		    System.out.println("a ="+a+" and "+"b ="+b);
		   
	}
}
