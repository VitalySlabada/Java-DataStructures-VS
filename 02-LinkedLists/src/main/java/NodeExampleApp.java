public class NodeExampleApp {
    public static void main(String[] args) {
        MyNode nodeA=new MyNode("myLLpkg.Node A");
        MyNode nodeB=new MyNode("myLLpkg.Node B");
        MyNode nodeC=new MyNode("myLLpkg.Node C");



        nodeA.next = nodeB;
        nodeB.next = nodeC;

        System.out.println(nodeA.next.next.name);

        MyNode current= nodeA;
        //to iterato
        while(current!=null){
            System.out.println(current.name);
            current = current.next;

        }


    }

}
