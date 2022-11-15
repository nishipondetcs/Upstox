package String_Class;

public class Find_index_rev {
//find the index of i in the following string from reverse side
	public static void main(String[] args) {
		String org="Electrical";
		String rev="";
		for(int i=org.length()-1;i>=0;i--) {
			rev=rev+org.charAt(i);
		}
		System.out.println(rev.indexOf('i'));
	}
}
