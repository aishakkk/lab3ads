# ⭐ Assignment 3  |  Karakuzov Bekbolat
## 🔔 interfaces
### 📗 Stack.java
> **Description:** creating interface Stack.java helps to define all methods we have to do and then we implements this interface in class MyArrayListStack
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
> **Description:** creating interface Queue.java helps to define all methods we have to do and then we implements this interface in class MyArrayListQueue
```java
public interface Queue<T> {
    void enqueue(T item);
    T dequeue();
    T peek();
    boolean isEmpty();
    int size();
}
```
