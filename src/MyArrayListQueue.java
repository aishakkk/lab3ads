public class MyArrayListQueue<T> implements Queue<T> {
    private MyArrayList<T> list;
    public MyArrayListQueue() {
        this.list = new MyArrayList<>();
    }
    public void printQueue() {
        System.out.println("Your queue right now like this:");
        System.out.print("__________");
        System.out.println("______".repeat(list.size()));
        System.out.print("|  Queue  ");
        for(int i = 0; i < size(); i++) {
            System.out.print("|  " + list.get(i) + "  ");
        }
        System.out.println("|");
        System.out.print("----------");
        System.out.println("------".repeat(list.size()));
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
        return list.get(list.size()-1);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }
}
