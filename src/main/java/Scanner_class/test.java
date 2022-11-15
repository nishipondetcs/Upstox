package Scanner_class;
import java.util.Scanner;

public class test {
public static void main(String[] args) {
	try(//Conduct even/odd test
	Scanner s=new Scanner(System.in)){
		//accept number
		System.out.println("Hey user enter your number");
		int num=s.nextInt();
		//check even/odd
		if(num%2==0) {
			System.out.println("Given number is even");
		}
		else {
			System.out.println("Given number is odd");
			
		}
	}
	
}
}
