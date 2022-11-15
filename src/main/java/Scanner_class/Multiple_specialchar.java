package Scanner_class;
import java.util.Scanner;

public class Multiple_specialchar {
public static void main(String[] args) {
	try (Scanner s = new Scanner(System.in)) {
		
		//remove multiple special characters from string
		System.out.println("Hey user provide input");
		String name=s.next();//user will give input as: Vi$n@ay#
		String correctname=name.replaceAll("[^a-z A-Z]","");
		System.out.println(correctname);
		
	}
	
	
	}
} 
