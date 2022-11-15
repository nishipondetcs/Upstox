package Logical_programs;

public class product {
public static void main(String[] args) {
	// print product of integers from 4 to 10.
	//ans=4*5*6*7*8*9*10
	//so, Upper Range (UR)=10
	//and Lower Range (LR)=4
	int UR=10;
	int LR=4;
	int fact=1;
	for(int a=LR;a<=UR;a++) {
		fact=fact*a;
		// fact=1*4=4;
		//fact=4*5=20;
		// fact=20*6=120;
		
	}	System.out.println(fact);//written outside loop to get final result and not every iteration result
	

}
}