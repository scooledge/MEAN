package csc143.data_structures;

/*
 * interface BoundedQueue
 */
public interface BoundedQueue {
  /*
   * @param o, the object in the queue
   * @throws overfill exception if queue is full
   */
  public void enqueue(Object o) throws Overfill;
  
  /**
   * dequeue takes away
   * @return Object
   * @throws Underempty if queue is empty
   */
  public Object dequeue()throws Underempty;
  
  /**
   * tells us whether queue is empty or not
   * @return true or false boolean
   */
  public boolean isNotEmpty();
  
  /**
   * @return true or false whether queue is full or not
   */
  public boolean isNotFull();
  
  /**
   * the size of the queue
   * @return int 
   */
  public int size();
  
  /**
   * @return string
   */
  public String toString();
  
  /**
   * @return int
   */
  public int capacity();
  
}
