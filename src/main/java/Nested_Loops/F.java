package Nested_Loops;

public class F {
//print following pattern: * - - -
	//                     - * - - 
	//                     - - * -
	//                     - - - *
	public static void main(String[] args) {
		for(int a=1;a<=4;a++) {
			for(int b=1;b<=4;b++) {
				if(a==b) {
					System.out.print(" *");
					
				}
				else {System.out.print("  ");
			}
		}
			System.out.println();
	}
}
}