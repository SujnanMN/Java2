package Testunit;

import org.junit.Ignore;

import junit.framework.TestCase;

public class Testthis extends TestCase{
	@Ignore
	public void testmultiply()
	{
		System.out.println("In testing");
		boolean act=Multiply.multi(10);
		assertTrue(act);
	}

	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		System.out.println("Setting envi for test");
	}

	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
		System.out.println("Teardown after setting all");
	}
	
}
