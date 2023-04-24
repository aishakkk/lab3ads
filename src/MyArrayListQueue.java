public class MyArrayListQueue<T> implements Queue<T> {
    private MyArrayList<T> list;
    public MyArrayListQueue() {
        this.list = new MyArrayList<>();
    }

    @Override
    public void enqueue(T item) {
        list.add(item, 0);
    }

    @Override
    public T dequeue() {
        return (T) list.remove(list.size()-1);
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
