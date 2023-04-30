# ⭐ Assignment 3  |  Karakuzov Bekbolat
## 🔔 interfaces
### 📗 Stack.java
> **Description:** creating an interface Stack.java helps to define all methods we have to do and then we implements this interface in class MyArrayListStack.
```java
public interface Stack<T> {
    void push(T item);
    T pop();
    T peek();
    boolean isEmpty();
    int size();
}
```
### 📗 Queue.java
> **Description:** creating an interface Queue.java helps to define all methods we have to do and then we implements this interface in class MyArrayListQueue.
```java
public interface Queue<T> {
    void enqueue(T item);
    T dequeue();
    T peek();
    boolean isEmpty();
    int size();
}
```
## 🔔 classes
### 📘 MyArrayListStack.java
> **Description:** creating a class MyArrayListStack to understand how stacks works and see examples. Class has method: *push*, *pop*, *peek*, *isEmpty*, *size*, *printStack*.
###
🌕 **method printStack()**
```java
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
```
🌕 **method push()**
```java
@Override
public void push(T item) {
    list.add(item, 0);
}
```
🌕 **method pop()**
```java
@Override
public T pop() {
    return (T) list.remove(0);
}
```
🌕 **method peek()**
```java
@Override
public T peek() {
    return list.get(0);
}
```
🌕 **method isEmpty()**
```java
@Override
public boolean isEmpty() {
    return list.isEmpty();
}
```
🌕 **method size()**
```java
@Override
public int size() {
    return list.size();
}
```
### 📘 MyArrayListQueue.java
> Description: creating a class MyArrayListQueue to understand how queues works and see examples. Class has method: *enqueue*, *dequeue*, *peek*, *isEmpty*, *size*, *printStack*.
###
🌑 **method printStack()**
```java
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
```
🌑 **method enqueue()**
```java
@Override
public void enqueue(T item) {
    list.add(item, 0);
}
```
🌑 **method dequeue()**
```java
@Override
public T dequeue() {
    return (T) list.remove(list.size()-1);
}
```
🌑 **method peek()**
```java
@Override
public T peek() {
    return list.get(list.size()-1);
}
```
🌑 **method isEmpty()**
```java
@Override
public boolean isEmpty() {
    return list.isEmpty();
}
```
🌑 **method size()**
```java
@Override
public int size() {
    return list.size();
}
```
