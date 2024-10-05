package StackOperations;

class StackOverflowException extends RuntimeException {
    public StackOverflowException(String message) {
        super(message);
    }
}
class StackUnderflowException extends RuntimeException {
    public StackUnderflowException(String message) {
        super(message);
    }
}

public class BasicStack {
    private double[] stack;
    private int size;

    public BasicStack(int capacity) {
        stack = new double[capacity];
        size = 0;
    }
    public boolean isFull() {
        return size == stack.length;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public void push(double value) {
        if (isFull()) {
            throw new StackOverflowException("Stack overflow!");
        } else {
            stack[size++] = value;
        }
    }
    public double pop() {
        if (isEmpty()) {
            throw new StackUnderflowException("Stack underflow!");
        } else {
            return stack[--size];
        }
    }
    public double peek() {
        if (isEmpty()) {
            throw new StackUnderflowException("Stack is empty!");
        } else {
            return stack[size - 1];
        }
    }
}
