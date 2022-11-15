package Logical_programs;

public class Factorial {
public static void main(String[] args) {
	// 5 fact=5*4*3*2*1=120
	int num=5;
	int fact=1;
	for(int i=1;i<=num;i++) {
		fact=fact*i;
		// fact=1*1=1;
		// fact=1*2=2;
		// fact=2*3=6;
		// fact=6*4=24;
		// fact=24*5=120;
		
	}System.out.println(fact);
}
}
