package static_regular_methods;

public class SRM_call_from_diff_class {
	public static void main(String[] args) {
		System.out.println("main method started");
		
		SRM_call_from_diff_class1.a1();//method calling statement for method from diff class.
		SRM_call_from_diff_class1.a2();//syntax= classname.methodname(); (for diff class)
		a1();
		System.out.println("main method ended");
		
	}
	public static void a1() {
		System.out.println("I am form same class");
	}

}
