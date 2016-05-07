
package csc143.data_structures;

/*
 * interface BoundedStack
 */
public interface BoundedStack {
  
  /*
   * pushes the object through stack
   * @param o, the object
   * @throws Overfill exception if stack is full
   */
  public void push(Object o) throws Overfill;
  
  /**
   * @return Object
   * @throws Underempty exception if stack is empty
   */
  public Object pop()throws Underempty;
  
  /**
   * @return true or false if stack is empty
   */
  public boolean isNotEmpty();
  
  /**
   * @return true or false if stack is full or not
   */
  public boolean isNotFull();
  
  /**
   * @return the int size
   */
  public int size();
  
  /**
   * @return String object
   */
  public String toString();
  
  /**
   * @return int capacity
   */
  public int capacity();
  
  
}