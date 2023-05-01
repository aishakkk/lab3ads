import java.util.NoSuchElementException;

public class MyLinkedListQueue<T> implements Queue<T> {
    private MyLinkedList<T> list; // LinkedList from last assignment to store data
    /**
     * @function MyLinkedListQueue - constructor to create an linkedlist
     * @noparam
     * @return void
     */
    public MyLinkedListQueue() {
        this.list = new MyLinkedList<>();
    }
    /**
     * @function enqueue - method adds an element to the back of the queue using the add method for MyLinkedList
     * @param item - given element to add in queue
     * @return void
     */
    @Override
    public void enqueue(T item) {
        list.add(item, 0);
    }
    /**
     * @function dequeue - method removes and returns the front element of the queue using the remove method for MyLinkedList
     * @noparam
     * @return T - returning first element in queue in generic type
     */
    @Override
    public T dequeue() {
        return (T) list.remove(list.size()-1);
    }
    /**
     * @function peek -  method returns the front element of the queue without removing it using the get method for MyLinkedList
     * @noparam
     * @return T - returning first element in queue in generic type
     */
    @Override
    public T peek() throws NoSuchElementException {
        isEmptyThrowException();
        return (T) list.get(list.size()-1);
    }
    /**
     * @function isEmpty - method returns true if the queue is empty or false if it is not using the isEmpty method for MyLinkedList
     * @noparam
     * @return boolean - return true if queue is empty, false otherwise
     */
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
    /**
     * @function size - method returns the number of elements in the queue using the size method for MyLinkedList
     * @noparam
     * @return int - size of queue
     */
    @Override
    public int size() {
        return 0;
    }
    /**
     * @function isEmptyThrowException - throwing exception to avoid errors
     * @noparam
     * @return void
     */
    private void isEmptyThrowException() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
    }
}
