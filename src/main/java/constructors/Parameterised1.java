package constructors;

public class Parameterised1 {//ULC
	
public static void main(String[] args) {
	
Parameterised w=new Parameterised("hii",3,5);
	w.math();
	Parameterised q=new Parameterised("Hello",8,10);//this is constructor overloading
	q.math();
}
//Conclusion: constructor can be overloaded as above but it cannot be overridden. 
}
