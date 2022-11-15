package Control_or_conditional_statements;

public class Sample3 {
	public static void main(String[] args) {
		int o=590;
		int h=100;
		int t=600;
		int p=o*h;
		double marks=p/t;
		

		System.out.println("your percentage is: "+marks);
		System.out.println("and your result is: ");
		
		if(marks>=75) {
			System.out.println("passed in 1st class with distinction");
		}
		else if(marks>=60) {
			System.out.println("passed with 1st class");
		}
		else if(marks>=50) {
			System.out.println("passed with 2nd class");
		}
		else if(marks>=40) {
			System.out.println("passed with 3rd class");
		}
		else if(marks>=35) {
			System.out.println("pass");
		}
		else {System.out.println("Failed");}
	}

}
