package Scanner_class;
import java.util.Scanner;
public class addition {
public static void main(String[] args) {
	try (Scanner s = new Scanner(System.in)) {
		//accept first no. from user
		System.out.println("hey user enter 1st number: ");
		int num1=s.nextInt();
		//accept second no. from user
		System.out.println("hey user enter 2nd number: ");
		int num2=s.nextInt();
		// addition
		System.out.println(num1+num2);
	}
}
}
