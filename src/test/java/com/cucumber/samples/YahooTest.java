package com.cucumber.samples;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class YahooTest extends TestCase {

	public YahooTest(String name) {
		super(name);
	}

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( YahooTest.class );
    }    
    
	protected void setUp() throws Exception {
		super.setUp();
		System.out.println("Yahoo setUp called");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		System.out.println("Yahoo tearDown called");
	}
	
	public void testApp()
    {
		System.out.println("Yahoo testApp called");
		assertTrue( true );
    }
	
	public void testApp1()
    {
		System.out.println("Yahoo testApp1 called");
		assertTrue( true );
    }

}
