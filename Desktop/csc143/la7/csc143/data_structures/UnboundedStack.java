package csc143.data_structures;

public interface UnboundedStack {
  
  /**
   * @param o, the Object
   */
  public void push(Object o) ;
  /**
   * @return Object 
   * @throws Underempty exception if stack is empty
   */
  public Object pop()throws Underempty;
  
  /**
   * @return true or false if empty or not
   */
  public boolean isNotEmpty();
  
  /**
   * @return int size Object
   */
  public int size();
  
  /**
   * @return the String Object
   */
  public String toString();
  
  /**
   * @return the int Object
   */
  public int capacity();
  
}