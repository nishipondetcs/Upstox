package Collections;
import java.util.ArrayList;
public class arraylist {
public static void main(String[] args) {
   ArrayList s=new ArrayList();
	s.add("Nishikant");
	s.add(100);
	s.add('G');
	s.add(null);
	s.add(8.456);
	s.add(true);
	s.add(100);
	s.add(null);
	s.add("Prachi");
	s.add("03.06.95");
	s.add('S');
	
	
	
	//print all data
	System.out.println(s);
	//get the size
	System.out.println(s.size());//max capacity is 10
	//check whether it is empty
	System.out.println("Is it Empty? -"+s.isEmpty());
	//insertion operation
	s.add(23);
	s.add("Ponde");
	System.out.println(s);
	System.out.println(s.size());//size=12 (increased)
	System.out.println();
	//delete operation
	s.remove(7);//index of the value to be deleted
	System.out.println(s);
}
}
