package csc143.data_structures;

public class MyBoundedStack implements BoundedStack {
  
  /*
   * constructor takes in max size in integer form
   * @param max, the int size
   */
  public MyBoundedStack(int max) {
    
    
  }
  
/*
   * pushes the object through stack
   * @param o, the object
   * @throws Overfill exception
   */
  public void push(Object o) throws Overfill {
  }
  
  /**
   * @return Object
   * @throws Underempty exception is empty
   */
  public Object pop() throws Underempty{
    return null;
  }
  
  
  /**
   * @return true or false if stack is empty
   */
  public boolean isNotEmpty(){
    return false;
  }
  
  /**
   * @return true or false if stack is full or not
   */
  public boolean isNotFull(){
    return false;
  }
  
  /**
   * @return the int size
   */
  public int size(){
    return 0;
  }
  
  /**
   * @return String object
   */
  public String toString(){
    return null;
  }
  
  /**
   * @return int capacity
   */
  public int capacity(){
    return 0;
  }
  


  
}