package Collections;

import java.util.Vector;

public class vector {
public static void main(String[] args) {
	Vector vec=new Vector();
	vec.add("Nishikant");
	vec.add(30695);
	vec.add('P');
	vec.remove(2);
	vec.add('N');
	vec.add(7.999);
	vec.add(false);
	vec.add(null);
	vec.add('L');
	vec.add("Ponde");
	vec.add("shirajgaon");
	vec.add('A');
	vec.add("extra");
	vec.add("added");
	
	System.out.println(vec);
	System.out.println("Size is: "+vec.size());
	
}
}
