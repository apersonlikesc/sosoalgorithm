import java.util.ArrayList;
import java.util.List;

public class MyCircularQueue {
    /** Initialize your data structure here. Set the size of the queue to be k. */
    private Integer[] data;
    private Integer front;
    private Integer rear;
    public MyCircularQueue(int k) {
        data = new Integer[k];
        front = rear = null;
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(this.isFull())
        {
            return false;
        }else{
            if(rear==null){
                front = rear =0;
                data[rear] = value;
                return true;
            }
            rear = (++rear) % data.length;
            data[rear] = value;
            return true;
        }
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(this.isEmpty())
        {
            return false;
        }else{
            if(front == rear)
            {
                front = rear = null;
            }else{
                front = ++front % data.length;
            }
            return true;
        }
    }

    /** Get the front item from the queue. */
    public int Front() {
        if(front == null)
            return -1;
        return data[front];
    }

    /** Get the last item from the queue. */
    public int Rear() {
        if(rear == null)
            return -1;
        return data[rear];
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        if(front == rear&&front==null)
            return true;
        return false;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        if(rear!=null && front!=null&&(rear+1)%data.length == front)
            return true;
        return false;
    }

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
}


///*
//class MyCircularQueue {
//
//    private int[] data;
//    private int head;
//    private int tail;
//    private int size;
//
//    /** Initialize your data structure here. Set the size of the queue to be k. */
//public MyCircularQueue(int k) {
//    data = new int[k];
//    head = -1;
//    tail = -1;
//    size = k;
//}
//
//    /** Insert an element into the circular queue. Return true if the operation is successful. */
//    public boolean enQueue(int value) {
//        if (isFull() == true) {
//            return false;
//        }
//        if (isEmpty() == true) {
//            head = 0;
//        }
//        tail = (tail + 1) % size;
//        data[tail] = value;
//        return true;
//    }
//
//    /** Delete an element from the circular queue. Return true if the operation is successful. */
//    public boolean deQueue() {
//        if (isEmpty() == true) {
//            return false;
//        }
//        if (head == tail) {
//            head = -1;
//            tail = -1;
//            return true;
//        }
//        head = (head + 1) % size;
//        return true;
//    }
//
//    /** Get the front item from the queue. */
//    public int Front() {
//        if (isEmpty() == true) {
//            return -1;
//        }
//        return data[head];
//    }
//
//    /** Get the last item from the queue. */
//    public int Rear() {
//        if (isEmpty() == true) {
//            return -1;
//        }
//        return data[tail];
//    }
//
//    /** Checks whether the circular queue is empty or not. */
//    public boolean isEmpty() {
//        return head == -1;
//    }
//
//    /** Checks whether the circular queue is full or not. */
//    public boolean isFull() {
//        return ((tail + 1) % size) == head;
//    }
//}
//
///**
// * Your MyCircularQueue object will be instantiated and called as such:
// * MyCircularQueue obj = new MyCircularQueue(k);
// * boolean param_1 = obj.enQueue(value);
// * boolean param_2 = obj.deQueue();
// * int param_3 = obj.Front();
// * int param_4 = obj.Rear();
// * boolean param_5 = obj.isEmpty();
// * boolean param_6 = obj.isFull();
// */
// */