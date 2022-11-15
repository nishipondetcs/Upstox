package String_Class;

public class Startswith {
public static void main(String[] args) {
	String a="Nishikant";
	System.out.println(a.startsWith("ni"));//false; as it is Case Sensitive
	System.out.println(a.startsWith("N"));//true
	System.out.println(a.startsWith("Nis"));//true
	
}
}
