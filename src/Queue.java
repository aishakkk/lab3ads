public interface Queue<T> {
    void enqueue(T item); // adds an element to the back of the queue
    T dequeue(); // removes and returns the front element of the queue
    T peek(); // returns the front element of the queue without removing it
    boolean isEmpty(); // returns true if the queue is empty or false if it is not
    int size(); // returns the number of elements in the queue
}
