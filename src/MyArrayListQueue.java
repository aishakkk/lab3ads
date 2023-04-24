public class MyArrayListQueue<T> implements Queue<T> {
    private MyArrayList<T> list;
    public MyArrayListQueue() {
        this.list = new MyArrayList<>();
    }

    @Override
    public void enqueue(T item) {

    }

    @Override
    public T dequeue() {
        return null;
    }

    @Override
    public T peek() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}
