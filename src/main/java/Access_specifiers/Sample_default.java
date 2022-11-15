package Access_specifiers;

public class Sample_default {

public void multiplication() {//access specifier=public
	//this method is called in another package named 'construtors' and class 'New'
		int a=12;
		int b=24;
		int c=a*b;
		System.out.println(c);
	}
protected void division() {
	int x=20;
	int y=5;
	int z=x/y;
	System.out.println(z);
}
void Multiplication1() {//Access specifier=default
	
	
	int a=15;
	int b=20;
	int c=a*b;
	System.out.println(c);
}
	
	public void substraction() {
		int a=6;
		int b=3;
		int c=a-b;
		System.out.println(c);
		
	}
	
}

