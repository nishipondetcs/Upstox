package Nested_loops_name;

public class I {
	//print I in 5*3 pattern
public static void main(String[] args) {
	for(int a=1;a<=5;a++) {
		for(int b=1;b<=3;b++) {
			if(a==1||a==5) {
				System.out.print(" P");
			}
			else if(b==2) {
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
