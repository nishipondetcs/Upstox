package Access_specifiers;

public class Sample1 {
// class as a whole can never be private
	
	
	 private int a;// variable declared
	         int b;// variable declared
	
	public Sample1(int a, int b) {//constructor defined
		this.a=a;
		this.b=b;
	}
	public void maths() {
		System.out.println("I like maths");
	}
	
	private void add() {//methods inside class can be private
		// when method is private, scope-for class only
		
		int c=a+b;
		System.out.println(c);
		
	}
	public static void main(String[] args) {
		Sample1 s=new Sample1(32,30);//constructor initialized with actual arg.
		s.add();
		
		
	}
}
