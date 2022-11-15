package Nested_Loops;

public class L {
//print following pattern: - - - *
	//                     - - * * * 
	//                     - * * * * * 
	//                     * * * * * * *
	 public static void main(String[] args) {
		int space=3;
		int star=1;
		for(int a=1;a<=4;a++) {
			for(int b=1;b<=space;b++) {
				System.out.print("  ");
				}
			for(int b=1;b<=star;b++){
				System.out.print(" *");
				
			}
			System.out.println();
			
				star=star+2;
				space--;
			
		}
	}
}
