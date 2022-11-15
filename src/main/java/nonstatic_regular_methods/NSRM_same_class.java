package nonstatic_regular_methods;

public class NSRM_same_class {
	public static void main(String[] args) {
		System.out.println("main method stated");
		
		NSRM_same_class q=new NSRM_same_class();//object creation
				
		q.m1();
		q.m2();
		
		System.out.println("main method ended");
	}
	public void m1() {
		int s=23;
		short d=32;
		int f=s+d;
		System.out.println(f);
	}
	public void m2() {
		System.out.println("I am from non static regular method m2 from same class");
	}

}
