package Logical_programs;

public class Prime_no_Check {
public static void main(String[] args) {
	int num=997;
	int count=0;
	for(int i=1;i<=num;i++) {
		if(num%i==0) { //for remainder 
			count++;
		//12/1=12 r=0 count=1
		//12/2=6 r=0 count=2
		//12/3=4 r=0 count=3
		//12/4=3 r=0 count=4
		//12/5=2 r=2
		//12/6=2 r=0
		//12/7=1 r=5
	}
	}	
	
	if(count==2||count==1) {
		System.out.println("given no. is prime");
		
	}

	else {
		System.out.println("given no. is not prime");
	}
}
}
