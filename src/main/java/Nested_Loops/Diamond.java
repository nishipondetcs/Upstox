package Nested_Loops;

public class Diamond {
	//print following pattern: - - - *
		//                     - - * * * 
		//                     - * * * * * 
		//                     * * * * * * *
	//                         - * * * * *
	//                         - - * * * 
	//                         - - - * 
		 public static void main(String[] args) {
			int space=3;
			int star=1;
			for(int a=1;a<=7;a++) {
				for(int b=1;b<=space;b++) {
					System.out.print("  ");
					}//first inner loop close
				for(int b=1;b<=star;b++){
					System.out.print(" *");
					
				}//second inner loop close
				System.out.println();
				if(a<=3) {
				star=star+2;
				space--;}
				else {
					star=star-2;
					space++;
				}
			}
		}
	}


