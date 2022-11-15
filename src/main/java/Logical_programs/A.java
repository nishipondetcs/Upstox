package Logical_programs;
import java.util.Scanner;
public class A {
public static void main(String[] args) throws InterruptedException {
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the numerator");
	int a=scan.nextInt();
	System.out.println("Enter the denominator");
	int b=scan.nextInt();
	
	
	try {int c=a/b;//infinity
	System.out.println(c);
	}

	catch(ArithmeticException abc) {
		Thread.sleep(3000);
		System.out.println("Please enter valid denominator");
	}


}
}
