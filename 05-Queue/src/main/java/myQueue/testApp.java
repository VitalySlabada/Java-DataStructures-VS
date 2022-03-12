package myQueue;

public class testApp {
    public static void main(String[] args) {

        MyQueue<Integer> myQueue = new MyQueue<>();
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);


        System.out.println(myQueue.peek());

        System.out.println(" removed item : " + myQueue.dequeue());
        System.out.println(" removed item : " + myQueue.dequeue());


    }

}
