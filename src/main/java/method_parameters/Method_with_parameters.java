package method_parameters;

public class Method_with_parameters {
	public static void main(String[] args) {
		Method_with_parameters d=new Method_with_parameters();//object created
	d.bodmas(4,15,3,6);//method calling statement
		print();//method calling statement
		
	}
	public void bodmas(int a,int b,int c,int d) {
	int x=a*b;//4*15=60
	int y=x/c;//20
	int z=y+d;//26
	System.out.println(z);//print 26 as ans
	System.out.println("value of x "+x+"; value of y "+y+"; value of z "+z);
	}
	public static void print() {
		System.out.println("Hi im nishikant");
	}
	static {//static initialization block executes before main method
		System.out.println("hii");
	}

}
