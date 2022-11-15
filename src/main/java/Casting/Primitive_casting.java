package Casting;

public class Primitive_casting {
	public static void main(String[] args) {
		double c=100;//100 (int datatype); output will be in double data type i.e. 100.0
		// double size=8 bytes; int size =4 bytes
		
long s=(short)32769;//range of short= -32768 to 32767
short w=(byte)129;// explicit casting

float a=45f;//implicit casting
float b=(int)152.25f;//explicit casting
// 152.25f converted to int= 152
//now 152 value can fit into following datatypes : short, int, long.
System.out.println(b);
			System.out.println(w);
    	System.out.println(s);
		System.out.println(c);
		System.out.println(a);
	}

}
//byte range = -128 to 127