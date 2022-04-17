import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirst {
    public static List<Integer> bfPrint (MyTree tree){
        List<Integer> result = new ArrayList<>();
        Queue<Node> myq = new LinkedList<>();
        Node myNode;
        //add root to queue
        myq.add(tree.root);
        while (!myq.isEmpty()){
            myNode= myq.remove();
            result.add(myNode.value);
            if (myNode.leftChild != null) myq.add(myNode.leftChild);
            if (myNode.rightChild != null) myq.add(myNode.rightChild);
        }
        return result;
    }
}
