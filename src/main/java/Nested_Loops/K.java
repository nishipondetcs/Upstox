package Nested_Loops;

public class K {
//print following pattern: * * * * *
	//                     - * * * * 
	//                     - - * * * 
	//                     - - - * * 
	//                     - - - - *
	public static void main(String[] args) {
		int space=0;
		int star=9;
		for(int a=1;a<=9;a++) {
			for(int b=1;b<=space;b++) {
				System.out.print(" ");
				}
			for(int b=1;b<=star;b++) {
				System.out.print(" *");
				}
			System.out.println();
			space++;
			star--;
		}
	}
}
