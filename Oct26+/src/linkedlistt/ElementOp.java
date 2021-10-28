package linkedlistt;

import java.util.ArrayList;
import java.util.Iterator;

public class ElementOp {
	public static void main(String[] args) {
		ArrayList <String> al = new ArrayList<String>();
		al.add("Apple");
		al.add("Ball");
		al.add("Cat");
		Iterator <String> it = al.iterator();
		System.out.println("Before adding: ");
		while(it.hasNext())
			System.out.println(it.next());
		al.add(0,"Zebra");
		System.out.println("After adding: ");
		Iterator <String> it1 = al.iterator();
		while(it1.hasNext())
			System.out.println(it1.next());
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Apple1");
		al1.add("Ball1");
		Iterator<String> it2 = al1.iterator();
		System.out.println("List 2 to test: ");
		while(it2.hasNext())
			System.out.println(it2.next());
		al.addAll(al1);
		Iterator <String> it3 = al.iterator();
		System.out.println("After adding two list: ");
		while(it3.hasNext())
			System.out.println(it3.next());
		
	}
}
