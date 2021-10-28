package collections;

import java.util.Iterator;
import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		s.push("Name1");
		s.push("Name2");
		s.push("Name3");
		// pop to remove an element 
		//FILO
		s.pop();
		s.pop();
		Iterator <String> it = s.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		
	}

}
