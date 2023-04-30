public class MyArrayListQueue<T> implements Queue<T> {
    private MyArrayList<T> list; // ArrayList from last assignment to store data
    /**
     * @function MyArrayListQueue - constructor to create an arraylist
     * @noparam
     * @return void
     */
    public MyArrayListQueue() {
        this.list = new MyArrayList<>();
    }
    /**
     * @function printQueue - method displaying queue in console in beautiful style
     * @noparam
     * @return void
     */
    public void printQueue() {
        System.out.println("Your queue right now like this:");
        System.out.print("__________");
        System.out.println("______".repeat(list.size()));
        System.out.print("|  Queue  ");
        for(int i = 0; i < size(); i++) { // going through the queue
            System.out.print("|  " + list.get(i) + "  ");
        }
        System.out.println("|");
        System.out.print("----------");
        System.out.println("------".repeat(list.size()));
    }

    /**
     * @function enqueue - method adds an element to the back of the queue using the add method for MyArrayList
     * @param item - given element to add in queue
     * @return void
     */
    @Override
    public void enqueue(T item) {
        list.add(item, 0);
    }

    /**
     * @function dequeue - method removes and returns the front element of the queue using the remove method for MyArrayList
     * @noparam
     * @return T - returning first element in queue in generic type
     */
    @Override
    public T dequeue() {
        return (T) list.remove(list.size()-1);
    }

    /**
     * @function peek -  method returns the front element of the queue without removing it using the get method for MyArrayList
     * @noparam
     * @return T - returning first element in queue in generic type
     */
    @Override
    public T peek() {
        return list.get(list.size()-1);
    }

    /**
     * @function isEmpty - method returns true if the queue is empty or false if it is not using the isEmpty method for MyArrayList
     * @noparam
     * @return boolean - return true if queue is empty, false otherwise
     */
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    /**
     * @function size - method returns the number of elements in the queue using the size method for MyArrayList
     * @noparam
     * @return int - size of queue
     */
    @Override
    public int size() {
        return list.size();
    }

    public void flush() {
        this.list = new MyArrayList<>();
    }
}
