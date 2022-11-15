package Nested_loops_name;

public class H {
//print H in 5*4 pattern
	public static void main(String[] args) {
		for(int a=1;a<=5;a++) {
			for(int b=1;b<=4;b++) {
				if(a==3||b==1) {
					System.out.print(" P");
				}
				else if(b==4) {
					System.out.print(" P");
				}
			
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
