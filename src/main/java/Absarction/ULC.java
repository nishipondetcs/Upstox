package Absarction;

public class ULC {
	
	public static void main(String[] args) {
		Concrete_class n=new Concrete_class();
		n.m2();
		n.m3();
		Abstract_class.m1();
		Abstract_class.m5();
	Abstract_class k=new Concrete_class();	//object for upcasting
	k.m6();
	}

}
