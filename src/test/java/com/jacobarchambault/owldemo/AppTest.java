package com.jacobarchambault.owldemo;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(
				AppTest.class);
	}

	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public AppTest(
			final String testName) {
		super(
				testName);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		Assert.assertTrue(
				true);
	}
}
