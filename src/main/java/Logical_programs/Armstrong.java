package Logical_programs;
import java.util.Scanner;
public class Armstrong {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Please Enter your number");
	int num=s.nextInt();//say user has given value 153
	int ActualNum=num;//=153
	int r=0;
	int arm=0;
	while(num>0) {
		r=num%10;
		//r=153%10=3
		//r=15%10=5
		//r=1%10=1
		
		arm=r*r*r+arm;
		//arm=3*3*3+0=27
		//arm=5*5*5+27=152
		//arm=1*1*1+152=153
		num=num/10;
		//num=153/10=15
		//num=15/10=1
		//num=1/10=0 (loop will stop executing from here as 0=0)
	}
	if(ActualNum==arm){//ActualNum has original value given by user & arm has calculated value 
		System.out.println("Given no. is Armstrong no.");
}
	else {
		System.out.println("Given no. is not Armstrong no.");
	}
}
}

