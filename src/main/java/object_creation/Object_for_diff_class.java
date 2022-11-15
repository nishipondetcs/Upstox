package object_creation;

public class Object_for_diff_class {// class body open
	
	public static void main(String[] args) {
		Object_for_diff_class1 g=new Object_for_diff_class1();//object created for diff class
		
		System.out.println(g.w);//run for non static global variable from diff class.
		System.out.println(g.k);//run for non static global variable from diff class.
		System.out.println(g.s);//run for non static global variable from diff class.
	}//main method closed

}//class body closed.

