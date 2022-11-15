package String_Class;

public class Equals {
public static void main(String[] args) throws InterruptedException {
	String a="Ponde";
	String b="Ponde";
	String c="ponde";
	String d="PONDE";
	System.out.println(a.equals(b));//true; matches exactly
	System.out.println();
	Thread.sleep(2000);//for fun ;)
	System.out.println(a.equals(c));//false; should match exactly; is case sensitive
	System.out.println();
	Thread.sleep(2000);//for fun ;)
	System.out.println(a.equals(d));//false; should match exactly; is case sensitive
	System.out.println();

}
}
