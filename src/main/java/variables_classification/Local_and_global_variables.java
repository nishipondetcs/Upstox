package variables_classification;

public class Local_and_global_variables {
static int a=78;//global variable

static int k;// only declared and not initialised

static long b=76141324;//global variable
static float g=98.65443f;//global variable
static String c="My name is nishikant";//global variable
static boolean d=false;//global variable
public static void main(String[] args) {//main method started
	System.out.println(a);//local variable
	System.out.println(k);//prints global variable only by declaring
	System.out.println(b);//local variable
	System.out.println(c);//local variable
	System.out.println(g);//local variable
	System.out.println(d);//local variable
	
	int n=23;//will run only if declared and initialized.
	
	char letter='D';//local variable
	System.out.println(n);//local variable
	System.out.println(letter);//local variable
}

}
