import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        testStack();
    }
    public static void testStack() {
        Scanner sc = new Scanner(System.in);
        MyArrayListStack<Integer> stack = new MyArrayListStack<>();
        System.out.println("Hi! Your stack of integers is empty now. Let's add some elements to stack\n" +
                "Type -1 to stop writing");
        int n = sc.nextInt();
        while (n != -1) {
            stack.push(n);
            n = sc.nextInt();
        }
        stack.printStack();
        System.out.println("Now, let's know which element on top of stack\n" +
                "Top - " + stack.peek());
        System.out.print("\nSo, let's remove elements and get top element of stack again\n" +
                "How much elements you want to remove? (1-" + stack.size() + "): ");
        int r = sc.nextInt();
        for (int i = 0; i < r; i++) {
            System.out.println("Removed element - " + stack.pop());
        }
        System.out.println();
        stack.printStack();
        System.out.println("Finally, let's check is your stack empty - " + stack.isEmpty());

    }
}