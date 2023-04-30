public class MyArrayListStack<T> implements Stack<T> {
    MyArrayList<T> list; // ArrayList from last assignment to store data

    /**
     * @function MyArrayListStack - constructor to create an arraylist
     * @noparam
     * @return void
     */
    public MyArrayListStack() {
        this.list = new MyArrayList<>();
    }

    /**
     * @function printStack - method displaying stack in console in beautiful format
     * @noparam
     * @return void
     */
    public void printStack() {
        System.out.println("Your stack right now like this:");
        String format = "|  %1$-3s|\n"; // format to print in console
        System.out.println("_______");
        System.out.format("|%1$-4s|\n", "Stack");
        System.out.println("|_____|");
        for(int i = 0; i < size(); i++) { // going through the stack
            System.out.format(format, list.get(i));
        }
        System.out.println("|_____|");
    }

    /**
     * @function push - method adds an element to the top of the stack using the add method for MyArrayList
     * @param item - given item to add in stack
     * @return void
     */
    @Override
    public void push(T item) {
        list.add(item, 0);
    }

    /**
     * @function pop - method removes and returns the top element of the stack using the remove method for MyArrayList
     * @noparam
     * @return T - returning top element in generic type
     */
    @Override
    public T pop() {
        return (T) list.remove(0);
    }

    /**
     * @function peek - method returns the top element of the stack without removing it using the get method for MyArrayList
     * @noparam
     * @return T - returning top element in generic type
     */
    @Override
    public T peek() {
        return list.get(0);
    }

    /**
     * @function isEmpty - method returns true if the stack is empty or false if it is not using the isEmpty method for MyArrayList
     * @noparam
     * @return boolean - true if stack is empty, false otherwise
     */
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    /**
     * @function size - method returns the number of elements in the stack using the size method for MyArrayList
     * @noparam
     * @return int - size of stack
     */
    @Override
    public int size() {
        return list.size();
    }

    public void flush() {
        this.list = new MyArrayList<>();
    }
}
