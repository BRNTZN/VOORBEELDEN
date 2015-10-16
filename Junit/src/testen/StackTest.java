package testen;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.Stack;

public class StackTest {
	
	private Stack<Integer> s;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		s = new Stack<Integer>();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void isEmpty_NewStack_ReturnsTrue() {
		assertTrue(s.isEmpty());
	}
	
	@Test
	public void isEmpty_OneElement_ReturnsFalse(){
		s.push(10);
		assertFalse(s.isEmpty());
	}
	
	@Test
	public void isEmpty_PushThenPop_ReturnsTrue() {
		s.push(10);
		s.pop();
		assertTrue(s.isEmpty());
	}
	
	@Test
	public void test4(){
		Integer tmp = new Integer(20);
		s.push(tmp);
		assertEquals(tmp,s.pop());
	}
	
	@Test
	public void test5(){
		Integer tmp1 = new Integer(1);
		Integer tmp2 = new Integer(2);
		Integer tmp3 = new Integer(3);
		s.push(tmp1);
		s.push(tmp2);
		s.push(tmp3);
		assertEquals(tmp3,s.pop());
		assertEquals(tmp2, s.pop());
		assertEquals(tmp1, s.pop());
	}
	
	@Test (expected =  UnsupportedOperationException.class)
	public void test6(){
		s.pop();
	}
	
	@Test
	public void test7(){
		s.push(5);
		s.top();
		assertFalse(s.isEmpty());
	}
	
	@Test
	public void test8(){
		Integer tmp = new Integer(5);
		s.push(tmp);
		assertEquals(tmp, s.top());
	}
	
	@Test
	public void test9(){
		Integer tmp1 = new Integer(1);
		Integer tmp2 = new Integer(2);
		Integer tmp3 = new Integer(3);
		s.push(tmp1);
		s.push(tmp2);
		s.push(tmp3);
		assertEquals(tmp3, s.top());
	}
	
	@Test
	public void test10(){
		Integer tmp1 = new Integer(1);
		s.push(tmp1);
		assertEquals(tmp1, s.top());
		assertEquals(tmp1, s.top());
		assertEquals(tmp1, s.top());
	}
	
	@Test (expected =  UnsupportedOperationException.class)
	public void test11(){
		s.top();
	}
	
	@Test
	public void test12(){
		s.push(null);
		assertFalse(s.isEmpty());
	}
	
	@Test
	public void test13(){
		s.push(null);
		assertTrue(s.pop()==null);
	}
	
	@Test
	public void test14(){
		s.push(null);
		assertTrue(s.top()==null);
	}
	
	@Test
	public void test15(){
		s.push(1);
		s.push(1);
		s.push(1);
		s.push(1);
		assertFalse(s.isEmpty());
	}

}
