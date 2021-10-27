package Testunit;

import java.util.ArrayList;
import java.util.List;

public class CollectionTest {
	ArrayList<String> al = new ArrayList<String>();

	public void add(String name) {
		// TODO Auto-generated method stub
		al.add(name);
	}
	public void remove (String name)
	{
		al.remove(name);
	}
	public Object sizeOf() {
		// TODO Auto-generated method stub
		return al.size();
	}
	public void remAll() {
		// TODO Auto-generated method stub
		al.clear();
	}
}
