package Nested_Loops;

public class J {
//print following pattern:
//	- - - - *
//  - - - * *
//  - - * * *
//  - * * * *
//  * * * * *	
	public static void main(String[] args) {
		int star=1;
		int space=4;
		for(int a=1;a<=5;a++) {
			for(int b=1;b<=space;b++) {
				System.out.print(" ");
			}//first inner loop closed
			for(int b=1;b<=star;b++) {
				System.out.print(" *");
				
			}//second inner loop closed
			System.out.println();
			space--;
			star++;
			
		}
		System.out.println(); 
		
		int starr=1;
		int spacee=4;
		for(int a=1;a<=5;a++) {
			for(int b=1;b<=spacee;b++) {
				System.out.print(" -");
			}//first inner loop closed
			for(int b=1;b<=starr;b++) {
				System.out.print(" *");
				
			}//second inner loop closed
			System.out.println();
			spacee--;
			starr++;
			
		}
	}
}
