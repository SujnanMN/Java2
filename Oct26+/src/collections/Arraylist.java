package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist   {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Name1");
		names.add("Name2");
		names.add("Name3");
		
		//using for loop for arraylist
		for (String name: names)
		{
			System.out.println(name);
		}
		/*
		
		//Using iterator for arraylist
		Iterator itr = names.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			}
		}
		
		*/
	}

}
