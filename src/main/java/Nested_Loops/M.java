package Nested_Loops;

public class M {
	//print following pattern : *
//                              * * 
//                              * * * 
	//                          * * * *
	 //                         * * * 
	//                          * *
	//                          *
	 
public static void main(String[] args) {
	int star=1;
	for(int a=1;a<=7;a++) {
		for(int b=1;b<=star;b++) {
			System.out.print(" *");	
		}
		System.out.println();
		if(a<=3) {
			star++;	
		}
		else {
			star--;}
		}
	}
}

