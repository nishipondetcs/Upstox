package Collections;

import java.util.HashSet;

public class hashset {
public static void main(String[] args) {
	HashSet hs=new HashSet();
	hs.add(909);
	hs.add("Nishikant");
	hs.add("Nishikant");//Duplicates are not allowed
	hs.add(100.002);
	hs.add(null);
	hs.add('A');
	hs.add(null);//only one null value allowed as set doesnt allow duplicates
	hs.add("Ponde");
	hs.add("Shirajgaon");
	hs.add("Prem");
	hs.add('D');
	hs.add(200);
	hs.add(101);
	
	System.out.println(hs);//order of insertion is random
	System.out.println(hs.size());
}
}
