package Nested_Loops;

public class Rangoli {

	// * * * * *
	// * * * *
	// * * *
	// * *
	// *
	//no. of rows = 5
	// no. of columns=5
	public static void main(String[] args) {
		for(int a=1;a<=5;a++) {
			for(int b=1;b<=5;b++) {
				if(a==1||b==1) {
					System.out.print(" *");
				}
				
				else if (a==2&&b==2){
					System.out.print(" *");
				}
				else if (a==2&&b==3){
					System.out.print(" *");
				}
				else if (a==2&&b==4){
					System.out.print(" *");
				}
				else if (a==3&&b==2){
					System.out.print(" *");
				}
				else if (a==3&&b==3){
					System.out.print(" *");
				}
				else if (a==4&&b==2){
					System.out.print(" *");
				}
				else {
					System.out.print("  ");
				}
				}
			System.out.println();
			}
		}
	}

