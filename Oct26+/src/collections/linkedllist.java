package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedllist {
	public static void main(String[] args) {
		LinkedList<String>  link = new LinkedList<String> ();
		link.add("Name");
		link.add("Name2");
		link.add("Name3");
		Iterator <String> itr = link.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		}

}
