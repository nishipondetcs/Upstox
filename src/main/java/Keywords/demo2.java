package Keywords;

//for use of this and super keyword

public class demo2 extends demo1 {//BLC
	
	int b=24;//non static global variable
	int a=5;
	public void test() {
System.out.println(super.b);// 'this' keyword used for calling variable from same class
System.out.println(this.b);//it will look into same class
System.out.println(super.a);//'super'keyword used for calling variable from another class
System.out.println(this.a);//it will look into same class
	}
}
