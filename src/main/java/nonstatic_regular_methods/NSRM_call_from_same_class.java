package nonstatic_regular_methods;

public class NSRM_call_from_same_class {
	public static void main(String[] args) {
		System.out.println("main method started");
		
		NSRM_call_from_same_class g=new NSRM_call_from_same_class();//object created when method is non static
		
		g.a1();//syntex- reference variable from object.methodname();
		g.a2();//we have to create object in main method to run a non-static regular method.
		
		System.out.println("main method ended");
	}
public void a1() {
	System.out.println("I am running from non static regular method a1");
	}
public void a2() {
	System.out.println("I am running from non static regular method a2");
	
}
}
