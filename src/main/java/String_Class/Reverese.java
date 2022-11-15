package String_Class;

public class Reverese {
public static void main(String[] args) {
	String f="abcba";
	String rev="";
	for(int i=f.length()-1; i>=0; i--) {
		rev=rev+f.charAt(i);	
		}
	System.out.println(rev);
	if(rev.equals(f)) {
		System.out.println("Given string is palindrome");
		
	}
	else {
		System.out.println("Given String isnt a palindrome");
	}
}
}
