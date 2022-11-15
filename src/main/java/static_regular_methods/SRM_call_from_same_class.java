package static_regular_methods;

public class SRM_call_from_same_class {
	public static void main(String[] args) {//main method started
		System.out.println("main method is started");
	a1();// method calling statement
	a2();//syntax= methodname(); (for same class)
	System.out.println("main method is ended");
	}//main method closed
public static void a1() { 
	int a=7;
	int b=8;
	int c=a+b;
	System.out.println(c);
System.out.println("I am running from regular method a1");//called method
}
public static void a2() {
	System.out.println("i am running from regular method a2 from same class");
	
}// main method ended
}// class body closed.
