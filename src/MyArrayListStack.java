public class MyArrayListStack<T> implements Stack<T> {
    MyArrayList<T> list;
    public MyArrayListStack() {
        this.list = new MyArrayList<>();
    }
    @Override
    public void push(T item) {
        list.add(item, 0);
    }

    @Override
    public T pop() {
        return (T) list.remove(0);
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
