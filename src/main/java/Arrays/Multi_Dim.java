package Arrays;

public class Multi_Dim {
	//    Mutidim array    10 12 15
	//                     17 21 51 
	//                     18 81 42 77
	//
public static void main(String[] args) {
	int ar[][]=new int[4][4];
	ar[0][0]=10;
	ar[0][1]=12;
	ar[0][2]=15;
	ar[1][0]=17;
	ar[1][1]=21;
	ar[1][2]=51;
	ar[2][0]=18;
	ar[2][1]=81;
	ar[2][2]=42;
	ar[2][3]=77;
	ar[3][0]=71;
	for(int i=0;i<=ar.length-1;i++) {//outer loop
		for(int j=0;j<=3;j++) {//inner loop
			System.out.print(" "+ar[i][j]);
		}
		System.out.println();
	}

			
}
}
