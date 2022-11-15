package Exception_handling;

import java.util.Scanner;

public class Arithmatic_exception {
public static void main(String[] args) throws InterruptedException{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the numerator");
	int a=scan.nextInt();
	System.out.println("Enter the denominator");
	int b=scan.nextInt();
	
	
	try {int c=a/b;//infinity
	//System.out.println(c);
	}
	catch(RuntimeException abc) {
		System.out.println("Please enter valid denominator");
		Thread.sleep(3000);
	}
}
}
