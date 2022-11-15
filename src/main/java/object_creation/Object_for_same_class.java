package object_creation;

public class Object_for_same_class {// class body open
	static int i=65;//declared and initialized
	int u=90;//declared and initialized
	long t=34l;//declared and initialized
	float f=75.5f;//declared and initialized
	float e=u+t+f;//declared and initialized
	String s1="im the best.";//declared and initialized
	String s12;// declared only
	public static void main(String[] args) {// main method open
		System.out.println(i);//direct output for static global variable

Object_for_same_class w=new Object_for_same_class();//object created for non static global variable
		
        System.out.println(w.u);//here, w is reference variable.
		System.out.println(w.t);
		System.out.println(w.f);
		System.out.println(w.e);
		w.s12="im better";// initialized in main method
		System.out.println(w.s12);
	}//main method closed

}// class body closed.
