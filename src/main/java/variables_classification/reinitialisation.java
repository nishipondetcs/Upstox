package variables_classification;

public class reinitialisation {
	int b;//only  declared
	public static void main(String[] args) {

		int a=3;
		a=2;
		a=5;//reinitialising the variale

		System.out.println(a);//5
		reinitialisation r=new reinitialisation();	
		System.out.println(r.b);
		
	}

}
