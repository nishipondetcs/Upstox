package variables;

public class new_class {
	static int d=27;//static global variable
public static void main(String[] args) {
	int a=56;
	int b=24;
	int c=a+b;
	new_class w=new new_class();
	System.out.println(c);
	System.out.println(w.d);//static global variable can be called using object of the class.
	System.out.println();
	System.out.println("klmn");
	w.math();
}
public void math() {//non static method can be written outside main method but has to called inside main method only.
	int x=10;
	int y=15;
	int z=x+y;
	System.out.println(z);
}
}
