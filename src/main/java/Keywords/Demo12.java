package Keywords;

//for use of this and super keyword

public class Demo12 extends Demo11 {
int a=3;
int b=5;


public void variable() {
	
	System.out.println(this.a);// it will 
	System.out.println(super.b);//it will look for b into superclass
}
}
