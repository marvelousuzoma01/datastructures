
public class Stack {
    int size;
    int top;
    int[] array;

    Stack(int capacity) {
        top = -1;
        size = capacity;
        array = new int[size];
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }

    boolean isFull() {
        return (top == size-1);
    }

    boolean isEmpty() {
        return (top == -1);
    }

    void push(int item) {

        if (isFull()) {
            System.out.println("stack Overflow");
        } else {
            array[top + 1] = item;
            top++;
        }
        
    }

    void pop(int item) {
        if (isEmpty()) {
            System.out.println("stack is empty");
        } else {
            array[top - 1] = item;
            top--;
        }
    }
}


/*
 * don't remove an item from the stack when it's empty.
 * insert at the top, remove from the top of a stack (stack follows LiFo principle).
 * don't insert into a full stack.
 * process of adding and removing is pushing and popping respectively.
 */
