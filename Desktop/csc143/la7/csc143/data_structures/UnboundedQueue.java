package csc143.data_structures;

/**
 * interface UnboundedQueue
 */
public interface UnboundedQueue {
  
  /**
   * @param o, the Object
   */
  public void enqueue(Object o) ;
  
  /**
   * @return Object
   * @throws Underempty exception
   */
  public Object dequeue()throws Underempty;
  
  /**
   * @return true or false if empty or not
   */
  public boolean isNotEmpty();
 /**
  * @return the size
  */
  public int size();
  
  /**
   * @return String object
   */
  public String toString();
  /**
   * @return the capacity int
   */
  public int capacity();
}