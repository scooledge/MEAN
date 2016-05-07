package csc143.data_structures;


//if we say extends Exception makes it a checked exception
public class Overfill extends DataStructureException {
  
  /**
   * COnstructor
   * @param msg, the string message
   */
  public Overfill(String msg) {
    super(msg);
  }
}