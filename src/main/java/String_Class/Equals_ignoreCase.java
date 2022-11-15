package String_Class;

public class Equals_ignoreCase {
public static void main(String[] args) {
	String a="Nishikant";
	String b="NIShikant";
	String c="Nishi";
	System.out.println(a.equalsIgnoreCase(b));//true
	System.out.println(a.equalsIgnoreCase(c));//false
			
}
}
