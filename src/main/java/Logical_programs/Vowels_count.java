package Logical_programs;

public class Vowels_count {
public static void main(String[] args) {
	
	String input="Nishikant Avinash Ponde";

	int L=input.length();
	int Vcount=0;
	int Concount=0;
	int space=0;
	
	System.out.println("String Length: "+L);
	for(int i=0;i<=L-1;i++) {
char alpha=input.charAt(i);

alpha=Character.toUpperCase(alpha);

if(alpha=='A'||alpha=='E'||alpha=='I'||alpha=='O'||alpha=='U') {
	Vcount++;
}
else if(alpha==' ') {
space++;	
}
 
Concount=L-Vcount-space;

}
	System.out.println("No. of Vowels: "+Vcount);
	System.out.println("No. of Consonents"+Concount);
		}
		
	}
	


