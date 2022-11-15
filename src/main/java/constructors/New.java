package constructors;
import Access_specifiers.Sample_default;// imported class from another package
public class New {
	//Attempt to call non static method from another package 
	
 public static void main(String[] args) {
	Sample_default f=new Sample_default();
	f.multiplication();// calling method from another package 
}
}
