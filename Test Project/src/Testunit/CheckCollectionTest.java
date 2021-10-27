package Testunit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CheckCollectionTest {
	CollectionTest ct = new CollectionTest();
	@Test
	public void add()
	{
		ct.add("Name1");
		ct.add("Name2");
		ct.add("Name3");
		assertEquals(3, ct.sizeOf());
	}
	@Test
	public void remove()
	{
		ct.remove("Name1");
		assertEquals(2, ct.sizeOf());
	}
	@Test
	public void remAll()
	{
		ct.remAll();
		assertEquals(0, ct.sizeOf());
	}
}
