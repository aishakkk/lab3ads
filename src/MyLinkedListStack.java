import java.util.EmptyStackException;
public class MyLinkedListStack<T> implements Stack<T> {
    private MyLinkedList<T> list;
    /**
     * @function MyLinkedListStack - constructor to create an linkedlist
     * @noparam
     * @return void
     */
    public MyLinkedListStack() {
        this.list = new MyLinkedList<>();
    }
    /**
     * @function push - method adds an element to the top of the stack using the add method for MyListList
     * @param item - given item to add in stack
     * @return void
     */
    @Override
    public void push(T item) {
        list.add(item, 0);
    }
    /**
     * @function pop - method removes and returns the top element of the stack using the remove method for MyLinkedList
     * @noparam
     * @return T - returning top element in generic type
     */
    @Override
    public T pop() {
        return (T) list.remove(0);
    }
    /**
     * @function peek - method returns the top element of the stack without removing it using the get method for MyLinkedList
     * @noparam
     * @return T - returning top element in generic type
     */
    @Override
    public T peek() {
        return (T) list.get(0);
    }
    /**
     * @function isEmpty - method returns true if the stack is empty or false if it is not using the isEmpty method for MyLinkedList
     * @noparam
     * @return boolean - true if stack is empty, false otherwise
     */
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
    /**
     * @function isEmptyThrowException - throwing exception to avoid errors
     * @noparam
     * @return void
     */
    private void isEmptyThrowException() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
    }
    /**
     * @function size - method returns the number of elements in the stack using the size method for MyLinkedList
     * @noparam
     * @return int - size of stack
     */
    @Override
    public int size() {
        return list.size();
    }
}
