package String_Class;

public class Contains {
public static void main(String[] args) {
	String a="Nishikant";
	String b="Nishi";
	System.out.println(a.contains(b));//true
	System.out.println(a.contains("Nishi"));//true
	System.out.println(a.contains("nishi"));// false ; it is case sensitive
	System.out.println(a.contains("shini"));//false
	System.out.println(a.contains(b));
	
}
}
