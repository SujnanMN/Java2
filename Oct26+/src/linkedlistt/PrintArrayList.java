package linkedlistt;

import java.util.ArrayList;
import java.util.Iterator;

public class PrintArrayList {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Names");
		al.add("55");
		//Normal
		System.out.println(al);
		//For-each loop
		for (String all: al)
		{
			System.out.println(all);
		}
		//Iterator
		Iterator <String> it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		//Normal for loop
		for (int i=0; i<al.size(); i++)
			System.out.println(al.get(i));
	}

}
