package Nested_Loops;

public class E {
//print following pattern : * * * *
	//                      *     *
	//                      * * * * 
	public static void main(String[] args) {
		for(int a=1;a<=3;a++) {
			for(int b=1;b<=4;b++) {
				if(a==2&&b==2||a==2&&b==3) {
				System.out.print("  ");//space star
				}
				else {
					System.out.print(" *");//double space
					
				}
			}
			System.out.println();
		}
		System.out.println();
		
		
		for(int a=1;a<=3;a++) {
			for(int b=1;b<=4;b++) {
				if(a==1||a==3||b==1||b==4) {
				System.out.print(" *");//space star
				}
				else {
					System.out.print("  ");//double space
					
				}
			}
			System.out.println();
		}
	}
}
