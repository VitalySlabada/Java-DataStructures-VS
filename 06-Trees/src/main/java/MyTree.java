import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MyTree {
    public Node root;

    public MyTree() {
    }

    public MyTree(Node root) {
        this.root = root;
    }

    public void insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return;
        }
        Node current = root;
        while (true) {
            if (value <= current.value) {
                if (current.leftChild == null) {
                    current.leftChild = newNode;
                    break;
                }
                current = current.leftChild;
            } else {
                if (current.rightChild == null) {
                    current.rightChild = newNode;
                    break;
                }
                current = current.rightChild;
            }

        }
    }// end insert

    //preorder
    //Root-Left-Right

    public void preOrderTraversal(Node root) {
        if (root == null) return; //empty tree
        System.out.print(root.value + ", ");
        preOrderTraversal(root.leftChild);
        preOrderTraversal(root.rightChild);
    }

    //Inorder
//    Left-root-right
    public void inOrderTraversal(Node root) {
        if (root == null) return; //empty tree
        inOrderTraversal(root.leftChild);
        System.out.print(root.value + ", ");
        inOrderTraversal(root.rightChild);
    }

    //postorder
    //Left-right-root
    public void postOrderTraversal(Node root) {
        if (root == null) return; //empty tree

        postOrderTraversal(root.leftChild);
        postOrderTraversal(root.rightChild);
        System.out.print(root.value + ", ");
    }


    public void  levelOrderTraversal(){
        if (root==null) return;
        Queue<Node> myq = new LinkedList<>();
        myq.add(root);
        while (!myq.isEmpty()){
            Node myNode= myq.poll();
            System.out.print(myNode.value + ", ");
            if (myNode.leftChild != null) myq.add(myNode.leftChild);
            if (myNode.rightChild != null) myq.add(myNode.rightChild);
        }
    }

    public boolean contains (int value){
        if(root==null) return false;
        Node currNode = root;
        while(currNode!=null) {
            if (currNode.value == value) return true;
            if (value > root.value) currNode = currNode.rightChild;
            if (value < root.value) currNode = currNode.leftChild;
        }
        return false;
    }

    public boolean isLeaf (Node node){
        return  node.leftChild == null && node.rightChild == null;
    }

    public void printLeaves(Node root) {
        if (root == null) return; //empty tree
        if (isLeaf(root)) System.out.print(root.value + ", ");
        printLeaves(root.leftChild);
        printLeaves(root.rightChild);
    }

    public int countLeaves(Node root) {
        if (root == null) return 0; //empty tree
        if (isLeaf(root)) return +1;
        return countLeaves (root.leftChild) + countLeaves(root.rightChild);
    }

    public int findSumOfLeaves(Node root) {
        if (root == null) return 0; //empty tree
        if (isLeaf(root)) return root.value;
        return findSumOfLeaves (root.leftChild) + findSumOfLeaves(root.rightChild);
    }

    public int height(Node root) {
        if (root == null) return -1;
        if (isLeaf(root)) return 0;//empty tree

        return 1 + Math.max(height(root.leftChild), height(root.rightChild));
    }



}

