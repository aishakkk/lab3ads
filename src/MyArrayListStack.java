public class MyArrayListStack<T> implements Stack<T> {
    MyArrayList<T> list;
    public MyArrayListStack() {
        this.list = new MyArrayList<>();
    }
    public void printStack() {
        System.out.println("Your stack right now like this:");
        String format = "|  %1$-3s|\n";
        System.out.println("_______");
        System.out.format("|%1$-4s|\n", "Stack");
        System.out.println("|_____|");
        for(int i = 0; i < size(); i++) {
            System.out.format(format, list.get(i));
        }
        System.out.println("|_____|");
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
        return list.get(0);
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
