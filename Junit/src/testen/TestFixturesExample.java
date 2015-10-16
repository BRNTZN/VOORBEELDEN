/*
 rem. (see http://docs.oracle.com/javase/tutorial/java/javaOO/nested.html for info about nested classes)
*/

package testen;

import java.io.Closeable;
import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestFixturesExample {
  static class ExpensiveManagedResource implements Closeable {
    @Override
    public void close() throws IOException {}
  }

  static class ManagedResource implements Closeable {
    @Override
    public void close() throws IOException {}
  }

  @BeforeClass
  public static void setUpClass() {
    System.out.println("@BeforeClass setUpClass is executed once before first test");
    myExpensiveManagedResource = new ExpensiveManagedResource();
  }

  @AfterClass
  public static void tearDownClass() throws IOException {
    System.out.println("@AfterClass tearDownClass is executed once after last test");
    myExpensiveManagedResource.close();
    myExpensiveManagedResource = null;
  }

  private ManagedResource myManagedResource;
  private static ExpensiveManagedResource myExpensiveManagedResource;

  private void println(String string) {
    System.out.println(string);
  }

  @Before
  public void setUp() {
    this.println("@Before setUp is executed before every test");
    this.myManagedResource = new ManagedResource();
  }

  @After
  public void tearDown() throws IOException {
    this.println("@After tearDown is executed after every test");
    this.myManagedResource.close();
    this.myManagedResource = null;
  }

  @Test
  public void test1() {
    this.println("@Test test1()");
  }

  @Test
  public void test2() {
    this.println("@Test test2()");
  }
}

