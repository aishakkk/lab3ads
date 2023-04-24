public interface Stack<T> {
    void push(T item); // adds an element to the top of the stack
    T pop(); //  removes and returns the top element of the stack
    T peek(); // returns the top element of the stack without removing it
    boolean isEmpty(); // returns true if the stack is empty or false if it is not
    int size(); // returns the number of elements in the stack
}
