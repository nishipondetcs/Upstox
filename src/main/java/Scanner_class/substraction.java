package Scanner_class;
import java.util.Scanner;

public class substraction {
public static void main(String[] args) {
	try (//perform subtraction op
	Scanner s = new Scanner(System.in)) {
		//get the first number
			System.out.println("enter first number: ");
			int num1=s.nextInt();
			//get the second number
			System.out.println("enter second number: ");
			int num2=s.nextInt();
			// subtraction
			System.out.println(num1-num2);
	}
	
}
}
