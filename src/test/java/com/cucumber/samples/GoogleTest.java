package com.cucumber.samples;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class GoogleTest extends TestCase {

	public GoogleTest(String name) {
		super(name);
	}

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( GoogleTest.class );
    }
    
	protected void setUp() throws Exception {
		super.setUp();
		System.out.println("Google setUp called");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		System.out.println("Google tearDown called");
	}
	
	public void testApp()
    {
		System.out.println("Google testApp called");
		assertTrue( true );
    }
	
	public void testApp1()
    {
		System.out.println("Google testApp1 called");
		assertTrue( true );
    }
}
