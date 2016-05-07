package csc143.test.data_structures;

import org.junit.*;
import static org.junit.Assert.*;

import csc143.data_structures.*;

/**
 * Test Class for MyBoundedStack
 * @author Sam Cooledge
 * @version Challenge
 */
public class TestMyBoundedStack {
  
  //create references to MyBounded stack
  private MyBoundedStack go1, go2;
  
  
  //before work
  @Before
  public void setUp(){
    //initialize those references
    go1 = new MyBoundedStack(5);
    go2 = new MyBoundedStack(-1);
    
  }
  
  /* Tests push to see if there is anything in it*/
  @Test
  public void testPush() throws Overfill {
    go1.push(3);
    Assert.assertEquals( "lets go testing" , 3 , go1.size());
  }
  
  
  @Test
  public void testPop() throws Underempty {
    
    go1.pop();
    Assert.assertEquals(0, go1.isNotEmpty());
  }
  @Test
  public void testIsNotFull() {
    
    Assert.assertEquals(false, go1.isNotFull()) ;
  }
  
  @Test
  public void testIsNotEmpty() {
    
    Assert.assertEquals(true, go1.isNotEmpty());
    
  }
  
  @Test
  public void testSize() {
    Assert.assertEquals(5, go1.size());
   
  }
  
  @Test
  public void testToString() {
    
    Assert.assertEquals("221 B baker Street" , go1.toString());
  }
  
  @Test
  public void testCapacity() {
    
    Assert.assertEquals(15, go1.capacity());
    
  }
  
  
}
