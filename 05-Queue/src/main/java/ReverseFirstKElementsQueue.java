import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class ReverseFirstKElementsQueue {
    public static void main(String[] args) {

        Deque<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(8);
        queue.add(9);



        System.out.println(reverseFirstK(queue, 6));

    }


    static public Deque<Integer> reverseFirstK(Deque<Integer> queue, int k) {
//
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i <= k-1; i++) {
            stack.push(queue.remove());
        }


        while (!stack.isEmpty()) queue.add((stack.pop()));


        for(int i = 0; i<queue.size()-k;i++) {


            queue.add(queue.remove());
        }
        return queue;
}

}
