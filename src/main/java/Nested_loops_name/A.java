package Nested_loops_name;

public class A {
	public static void main(String[] args) {
		for(int a=1;a<=5;a++) {
			for(int b=1;b<=4;b++) {
				if(a==3) {
				System.out.print(" P");
				}
				else if(a==1&&b==2) {
					System.out.print(" P");
				}
				else if(a==1&&b==3) {
					System.out.print(" P");
				}
				else if(a==2&&b==1) {
					System.out.print(" P");
				}
				else if(a==2&&b==4) {
					System.out.print(" P");
				}
				else if(a==4&&b==1) {
					System.out.print(" P");
				}
				else if(a==4&&b==4) {
					System.out.print(" P");
				}
				else if(a==5&&b==1) {
					System.out.print(" P");
				}
				else if(a==5&&b==4) {
					System.out.print(" P");
				}
				else {System.out.print("  ");
			}
		}
			System.out.println();
	}
}

}
