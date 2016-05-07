package csc143.data_structures;

/*
 * superclass extends from java exception class
 */
public class DataStructureException extends java.lang.Exception {
  
  /**
   * constructor takes in string message
   * @param msg, the string message
   */
  public DataStructureException(String msg){
    super(msg);
  }
}
    