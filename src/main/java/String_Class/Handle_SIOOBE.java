package String_Class;

public class Handle_SIOOBE {
public static void main(String[] args) throws InterruptedException {
	String s1="Nishikant";//it has 9 chars and index from 0 to 8.
	System.out.println(s1.charAt(7));//in bounds
	try{
		System.out.println(s1.charAt(9));//out of bounds; it will show SIOOBE
	}
	// lets handle this exception: write the risky code in try block and type of exception in catch block
	// exception type is stored in a variable
	catch(Exception A) {
		System.out.println("The data which you are trying to fetch is not present in the given string");
	System.out.println(A);
	}
	Thread.sleep(3000);
	System.out.println("Exception is handled");//it print after 3000 miliseconds i.e., 3 seconds time
}
}
