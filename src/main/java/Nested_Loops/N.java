package Nested_Loops;

public class N {
//print N in starpattern : N - - N
	//                     N N - N
	//                     N - N N 
	//                     N - - N
	
	//no. of rows=4(rows represented by variable a)
	//no. of columns=4(columns represented by variable b)
	public static void main(String[] args) {
		for(int a=1;a<=4;a++) {
			for(int b=1;b<=4;b++) {
				if(b==1||b==4||a==b) {
					System.out.print(" N");
				}
				
				else {System.out.print("  ");
			}
		}
			System.out.println();
	}
	}
}

