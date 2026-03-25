package DataStructure.Queues;

public class Queues {
    int[] arr;
    int size;
    int front;
    int back;

    Queues(int size) {
        this.size = size;
        arr = new int[size];
        front = -1;
        back = -1;
    }

    void push(int val) {
        if (back == size - 1) {
            System.out.println("Overflown");
            return;
        }
        back++;
        arr[back] = val;

        if (front == -1) {
            front++;
        }
    }

    void pop() {
        if (front == -1 || front > back) {
            System.out.println("Underflown");
            return;
        }
        front++;
    }

    int peek() {
        if (front == -1 || front > back) {
            System.out.println("Underflown");
            return -1;
        }
        return arr[front];

    }

    boolean isEmpty() {
        return (front == -1 || front > back);
    }
}
class Driver{
    public static void main(String[] args){
        Queues q = new Queues(6);

        q.push(10);
        q.push(20);
        q.push(30);
        q.push(40);
        q.push(50);
        q.push(60);
        q.push(70);

        System.out.println(q.peek());
        q.pop();
        System.out.println(q.peek());
        q.pop();
        System.out.println(q.peek());
        q.pop();

    }
}