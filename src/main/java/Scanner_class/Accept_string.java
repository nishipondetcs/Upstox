package Scanner_class;
import java.util.Scanner;

public class Accept_string {
public static void main(String[] args) {
	try (//accept String from user
	Scanner s = new Scanner(System.in)) {
		// enter name
		System.out.println("Hey user enter name: ");
		String name=s.next();
		System.out.println(name);
		
	}
	
}
}
