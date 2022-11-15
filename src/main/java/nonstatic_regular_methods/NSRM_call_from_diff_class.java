package nonstatic_regular_methods;

public class NSRM_call_from_diff_class {
public static void main(String[] args) {
	System.out.println("main method started");
	
	NSRM_call_from_diff_class1 t=new NSRM_call_from_diff_class1();//object created
	
	t.x1();//syntex: reference variable form object.methodname();
	t.x2();// we must create object for a non static method to run it in main method
	
	System.out.println("main method ended");
	
	}//main method close
}// class body closed
