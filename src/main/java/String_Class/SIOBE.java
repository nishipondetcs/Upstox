package String_Class;

public class SIOBE {
public static void main(String[] args) throws InterruptedException  {
	String s1="nishikant";
	try{
		System.out.println(s1.charAt(9));
		}
	catch(Exception a) {
		System.out.println("the index you are looking for is not present");
		System.out.println(a);
		Thread.sleep(3000);//for pause
		System.out.println("Exception is handelled");
	}
	
}
}

