public class TreeApp {
    public static void main(String[] args) {

        MyTree tree = new MyTree();


        int[] numbers=new int[] {10, 5, 12, 4, 6, 11, 13, 2,3,1};


        for (int i = 0; i<10;i++){
            tree.insert(numbers[i]);
        }
        VisualizeTree.printTree(tree.root, null,false);
//
//
//        System.out.println("preorder");
//        tree.preOrderTraversal(tree.root);
//        System.out.println();
//
//
//        System.out.println("inorder");
//        tree.inOrderTraversal(tree.root);
//        System.out.println();
//
//        System.out.println("postorder");
//        tree.postOrderTraversal(tree.root);
//        System.out.println();
        //System.out.println(tree.contains(0));


        System.out.println(tree.isLeaf(tree.root.leftChild.leftChild.leftChild.rightChild));
        System.out.println((tree.root.leftChild.leftChild.leftChild.rightChild.value));
        System.out.println("print leaves");
        tree.printLeaves(tree.root);

        System.out.println("count leaves: " + tree.countLeaves(tree.root));

        System.out.println("tree.findSumOfLeaves(tree.root) = " + tree.findSumOfLeaves(tree.root));
        System.out.println("Height " + tree.height(tree.root));


    }
}
