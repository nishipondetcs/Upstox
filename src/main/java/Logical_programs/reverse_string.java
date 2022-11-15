package Logical_programs;

public class reverse_string {
//reverse the string "AYUSH"
	public static void main(String[] args) {
		String abc="AYUSH";//immutable
		       abc="Nishikant";//reinitialized but immutable
		String cba="";
		for(int a=abc.length()-1;a>=0;a--) {
			cba=cba+abc.charAt(a);
			
		}
		System.out.println(cba);// HSUYA
	}
}
