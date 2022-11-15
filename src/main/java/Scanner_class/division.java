package Scanner_class;
import java.util.Scanner;

public class division {
public static void main(String[] args) {
	//perform division operation
	try (Scanner s = new Scanner(System.in)) {
		//enter dividend number
		System.out.println("Hey user enter dividend");
		int num1=s.nextInt();
		//enter divisor number
		System.out.println("Hey user enter divisor");
		
		int num2=s.nextInt();
		//division
		int d=num1/num2;
		
		System.out.println(d);
	}
}
}
