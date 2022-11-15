package Collections;

import java.util.LinkedList;

public class linkedlist {
public static void main(String[] args) {
	LinkedList ll=new LinkedList();
	ll.add(1);
	ll.add(2);
	ll.add("Nishi");
	ll.add("Nishi");
	ll.add(null);
	ll.add(3.695);
	System.out.println(ll);
	System.out.println(ll.size());
	ll.remove(1);//delete
	System.out.println(ll);//now prinnt updated linkedlist
	System.out.println(ll.size());//print updated size
}
}
