package csc143.data_structures;

public class MyBoundedQueue implements BoundedQueue {
  
  /**
   * Constructor
   * @param max, the int max size
   */
  public MyBoundedQueue(int max){
    
  }
  
  /*
   * @param o, the object in the queue
   * @throws overfill exception
   */
  public void enqueue(Object o) throws Overfill{
    
  }
  
  /**
   * dequeue takes away
   * @return Object
   * @throws Underempty is queue is empty
   */
  public Object dequeue()throws Underempty{
    return null;
    
  }
  /**
   * tells us whether queue is empty or not
   * @return true or false boolean
   */
  public boolean isNotEmpty(){
    return false; 
  }
  /**
   * @return true or false whether queue is full or not
   */
  public boolean isNotFull(){
    return false; 
  }
  
  /**
   * the size of the queue
   * @return int 
   */
  public int size(){
    return 0;
  }
  /**
   * @return string
   */
  public String toString(){
    return null;
  }
  /**
   * @return int
   */
  public int capacity(){
    return 0;
  }
}