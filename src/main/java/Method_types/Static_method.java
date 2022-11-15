package Method_types;

public class Static_method {//accessing members and method
	static int s=9;
	static int d;// variable declared
	
	public static void main(String[] args) {//static method
	int a=2;
	int b=3;
	b=4;
	b=5;// variable initialisation
	Static_method.d=45;//variable initialised
	int c=a+b+d;
	System.out.println(c);
	sub();//a static method can only call a static variable or method from same or another class
	
	
	}
	
	public static void sub() {
	int d=23;
	int e=32;
	System.out.println(s);// a static method calling a static variable from same class.
	System.out.println(d);
	System.out.println(e);
Sample.hello();// static method calling satic method from another class

	}
public void math() {
	int f=5;
	int g=6;
	int h=f+g;
	System.out.println(h);
	
}
}
