package Arrays;

public class Single_Dim {
public static void main(String[] args) {
	String ar[]=new String[4];//array length=4
	ar[0]="KGF";
	ar[1]="3 idiots";
	ar[2]="Dhoom";
	ar[3]="Pushpa";
	
	System.out.println(ar[0]);
	System.out.println(ar[3]);
	System.out.println(ar[1]);
	System.out.println(ar[2]);
	System.out.println();
	//print all data in one go and in sequence
	for(int i=0;i<=3;i++) {
		System.out.println(ar[i]);
	}
	System.out.println();
	for(int i=0;i<=ar.length-1;i++) {
		System.out.println(ar[i]);
	}
}
}
