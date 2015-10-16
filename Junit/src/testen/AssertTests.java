package testen;

import org.junit.Test;


public class AssertTests {
	  @Test
	  public void testAssertArrayEquals() {
	    byte[] expected = "trial".getBytes();
	    byte[] actual = "triab".getBytes();
	    org.junit.Assert.assertArrayEquals("failure - byte arrays not same", expected, actual);
	  }

	  @Test
	  public void testAssertEquals() {
		  // zijn 2 zaken gelijk volgens methode equals ?
	    org.junit.Assert.assertEquals("failure - strings are not equal", "text", "text");
	  }

	  @Test
	  public void testAssertFalse() {
	    org.junit.Assert.assertFalse("failure - should be false", false);
	    
	  }

	  @Test
	  public void testAssertNotNull() {
	    org.junit.Assert.assertNotNull("should not be null", new Object());
	  }

	  @Test
	  public void testAssertNotSame() {
	    org.junit.Assert.assertNotSame("should not be same Object", new Object(), new Object());
	  }

	  @Test
	  public void testAssertNull() {
	    org.junit.Assert.assertNull("should be null", null);
	  }

	  @Test
	  public void testAssertSame() {
	    Integer aNumber = Integer.valueOf(768);
	    // zijn 2 zaken gelijk volgens == (verwijzen ze naar zelfde referentie) ?
	    org.junit.Assert.assertSame("should be same", aNumber, aNumber);
	  }

	  @Test
	  public void testAssertTrue() {
	    org.junit.Assert.assertTrue("failure - should be true", true);
	  }
	}
