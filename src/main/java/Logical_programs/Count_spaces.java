package Logical_programs;

public class Count_spaces {
public static void main(String[] args) {
	String abc="A Java string is a sequence of characters that exists as an object of the class java. lang. Java strings are created and manipulated through the string class. Once created, a string is immutable -- its value cannot be changed. A string is sequence of characters.";//length=17
	
	int count=0;
	
	for(int i=0;i<=abc.length()-1;i++) {
		char v=abc.charAt(i);
		if(v==' ') {
			count++;// 
		}
	}
	System.out.println("No. of spaces: "+count);
}
}
