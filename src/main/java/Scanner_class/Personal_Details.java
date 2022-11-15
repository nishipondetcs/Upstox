package Scanner_class;
import java.util.Scanner;

public class Personal_Details {
public static void main(String[] args) {
	try (// accept personal details
	Scanner s = new Scanner(System.in)) {
		//accept name
		System.out.println("Enter your name: ");
		String name=s.next();
		//accept gender in single char(M/F)
		System.out.println("Enter your gender: ");
		char gender=s.next().charAt(0);
		System.out.println("Enter Age in Years: ");
		int age=s.nextInt();
		System.out.println("Enter berth choice");
		String berth=s.next();
		System.out.println();
		
		System.out.println(name+","+gender+","+age+","+berth);
	}
}
}
