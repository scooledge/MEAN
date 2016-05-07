package csc143.test.data_structures;

/**
 * A simple class that "touches" the stack and queue
 * interfaces / classes. This will cause them to be
 * compiled.
 */
public class CompileStackQueue {
    
    /**
     * The application method.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // touch the data structure interfaces
        csc143.data_structures.BoundedQueue bq;
        csc143.data_structures.BoundedStack bs;
        csc143.data_structures.UnboundedQueue uq;
        csc143.data_structures.UnboundedStack us;
        // instantiate them using the stub classes
        bq = new csc143.data_structures.MyBoundedQueue(3);
        bs = new csc143.data_structures.MyBoundedStack(3);
        uq = new csc143.data_structures.MyUnboundedQueue();
        us = new csc143.data_structures.MyUnboundedStack();
        // print out something
        System.out.println("Tada!");
    }
    
}