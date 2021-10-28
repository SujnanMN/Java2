package linkedlistt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class GetsetSort {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Apple");
		al.add("Zebra");
		al.add("Mango");
		al.add("35");
		System.out.println(al.get(3));
		al.set(3, "New");
		Iterator<String> it = al.iterator();
		System.out.println("String after setting: ");
		while(it.hasNext())
			System.out.println(it.next());
		System.out.println("Sortedlist: ");
		Collections.sort(al);
		Iterator <String> it1 = al.iterator();
		while(it1.hasNext())
			System.out.println(it1.next());
	}

}
