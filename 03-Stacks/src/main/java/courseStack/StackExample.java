package courseStack;

public class StackExample {
    public static void main(String[] args) {
//
//
//        MyStack<Character> myStack = new MyStack();
//        myStack.push('c');
//        myStack.push('b');
//        myStack.push('a');
//        System.out.println(myStack.pop());
//        System.out.println(myStack.pop());
//        System.out.println("Size of the stack is : " +myStack.size());










        var myStack = new MyStack<Integer>();
        //MyStack<Integer> myStack1 = new MyStack<>();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        System.out.println(myStack.size());

        System.out.println("pop: "+myStack.pop());

        System.out.println(myStack.size());
        System.out.println("pop: "+myStack.pop());
        System.out.println("pop: "+myStack.pop());
        System.out.println(myStack.size());
        myStack.push(3);
        myStack.push(4);
        System.out.println(myStack.size());


      System.out.println(ExprBalanceCheck.balanceCheck("[]"));
    }




}
