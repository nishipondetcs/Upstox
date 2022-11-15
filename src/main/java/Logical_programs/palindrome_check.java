package Logical_programs;

public class palindrome_check {
public static void main(String[] args) {
	String org="12321";
	String rev="";
	for(int a=org.length()-1;a>=0;a--) {
		rev=rev+org.charAt(a);
		
	}
	System.out.println(rev);
	if(org.equals(rev)) {
		System.out.println("given String is Palindrome");
	}
	else {
		System.out.println("given String is not palindrome");
	}
}
}
