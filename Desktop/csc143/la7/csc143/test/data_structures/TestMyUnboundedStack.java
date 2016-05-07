package csc143.test.data_structures;

import org.junit.*;
import static org.junit.Assert.*;

import csc143.data_structures.*;

/**
 * Test Class for MyBoundedStack
 * @author Sam Cooledge
 * @version Challenge
 */
public class TestMyUnboundedStack {
  
  //create references to MyBounded stack
  private MyUnboundedStack go1, go2;
  
  
  //before work
  @Before
  public void setUp(){
    //initialize those references
    go1 = new MyUnboundedStack();
    go2 = new MyUnboundedStack();
    
  }
  
  /* Tests push to see if there is anything in it*/
  @Test
  public void testPush() {
    go1.push(3);
    Assert.assertEquals( "lets go testing" , 3 , go1.size());
  }
  
  
  @Test
  public void testPop() throws Underempty {
    
    go1.pop();
    Assert.assertEquals(0, go1.isNotEmpty());
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
