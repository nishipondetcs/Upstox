package Nested_Loops;

public class A {
//print a5*5 all stars pattern
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {//outer loop= represents Rows
			for(int a=1;a<=5;a++) {//inner loop open= represents Column
				System.out.print("*");
			}//inner loop closed
			System.out.println();
		}
		
	}
}
