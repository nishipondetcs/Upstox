package Access_specifiers;

public class Sample2 {
public static void main(String[] args) {
	Sample1 d=new Sample1(45,44);
	
	d.maths();// method maths is visible from class Sample1 as it is not private
	
	//d.add();// method add() from Sample1 class is not visible as it is private
	
	System.out.println(d.b);//variable b from Sample1 is visible as it is not private
	
	//System.out.println(d.a);//variable a from Sample1 isn't visible as it is private
}

}
