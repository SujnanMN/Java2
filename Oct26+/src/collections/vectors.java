package collections;

import java.util.Iterator;
import java.util.Vector;



public class vectors {
	public static void main(String[] args) {
		Vector <String> vec= new Vector<String>();
		vec.add("n1");
		vec.add("n2");
		Iterator <String> itr = vec.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
